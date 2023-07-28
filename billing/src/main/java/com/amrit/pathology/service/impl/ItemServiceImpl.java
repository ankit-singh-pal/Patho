package com.amrit.pathology.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amrit.pathology.entity.ItemEntity;
import com.amrit.pathology.repository.ItemsRepository;
import com.amrit.pathology.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{


    @Autowired
    ItemsRepository itemsRepository;

    public String addItems(List<ItemEntity> request) {
        try {
        	List<ItemEntity> savedItems = itemsRepository.saveAll(request);
            return "Items added Successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	@Override
	public List<ItemEntity> getItemByName(String itemName) {
		return itemsRepository.getItemByName(itemName);
	}

	@Override
	public String deleteItems(List<Long> itemId) {
		try {
        	itemsRepository.deleteAllById(itemId);
            return "Items Successfully Deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return "Delete failure!";
        }
	}

}
