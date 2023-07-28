package com.amrit.pathology.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amrit.pathology.entity.CustomerEntity;
import com.amrit.pathology.entity.ItemEntity;

@Repository
public interface ItemsRepository extends JpaRepository<ItemEntity, Long>  {

	@Query(value = "SELECT * FROM items where item_name = :itemName", nativeQuery = true)
	List<ItemEntity> getItemByName(String itemName);

}
