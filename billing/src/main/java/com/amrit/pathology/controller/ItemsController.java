package com.amrit.pathology.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amrit.pathology.entity.ItemEntity;
import com.amrit.pathology.service.ItemService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pathology")
public class ItemsController {

	@Autowired
	ItemService itemService;

	@PostMapping(value = "/add/items")
	public ResponseEntity<String> addItems(@RequestBody List<ItemEntity> request) {
		return new ResponseEntity<>(itemService.addItems(request), HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/{itemName}")
	public ResponseEntity<List<ItemEntity>> getItemByName(@PathVariable String itemName) {
		return new ResponseEntity<>(itemService.getItemByName(itemName), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete")
	public ResponseEntity<String> deleteItems(@RequestParam List<Long> itemId) {
		return new ResponseEntity<>(itemService.deleteItems(itemId), HttpStatus.OK);
	}
}
