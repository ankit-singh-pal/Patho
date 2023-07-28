package com.amrit.pathology.service;

import org.springframework.stereotype.Service;

import com.amrit.pathology.entity.CustomerEntity;


public interface CustomerService {

	String addCustomers(CustomerEntity request);

	CustomerEntity getCustomerByPhoneNo(Long phoneNumber);

}
