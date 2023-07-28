package com.amrit.pathology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.amrit.pathology.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

	@Query(value = "SELECT * FROM customer where contact = :phoneNumber", nativeQuery = true)
	CustomerEntity getCustomerByPhoneNo(String phoneNumber);

}
