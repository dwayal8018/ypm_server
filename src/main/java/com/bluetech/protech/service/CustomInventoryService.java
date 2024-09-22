package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.ComponentInventory;

public interface CustomInventoryService {

	List<ComponentInventory> createCustomInventory(List<ComponentInventory> customInventoryList);

	List<ComponentInventory> getAllCustomInventories();

	Optional<ComponentInventory> getCustomInventoryById(Integer id);

	void deleteCustomInventory(Integer id);


}
