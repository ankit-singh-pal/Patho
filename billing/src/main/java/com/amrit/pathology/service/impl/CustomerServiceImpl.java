package com.amrit.pathology.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amrit.pathology.entity.CustomerEntity;
import com.amrit.pathology.repository.CustomerRepository;
import com.amrit.pathology.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	@Override
	public String addCustomers(CustomerEntity request) {
		try {
			customerRepository.save(request);

			return "Success";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public CustomerEntity getCustomerByPhoneNo(Long phoneNumber) {
		
		
		return customerRepository.getCustomerByPhoneNo(phoneNumber.toString());
	}

}
