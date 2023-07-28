package com.amrit.pathology.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amrit.pathology.entity.ItemEntity;


public interface ItemService {
	String addItems(List<ItemEntity> request);

	List<ItemEntity> getItemByName(String itemName);

	String deleteItems(List<Long> itemId);


}
