package com.amrit.pathology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amrit.pathology.entity.CustomerEntity;
import com.amrit.pathology.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping(value = "/add")
	public ResponseEntity<String> addItems(@RequestBody CustomerEntity request) {
		return new ResponseEntity<>(customerService.addCustomers(request), HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/{phoneNumber}")
	public ResponseEntity<CustomerEntity> getCustomerByPhoneNo(@PathVariable Long phoneNumber) {
		return new ResponseEntity<>(customerService.getCustomerByPhoneNo(phoneNumber), HttpStatus.OK);
	}
}
