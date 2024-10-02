package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.ComponentInventoryDTO;
import com.bluetech.protech.pojo.ComponentInventory;

public interface CustomInventoryService {

	List<ComponentInventoryDTO> createCustomInventory(List<ComponentInventoryDTO> list);

	List<ComponentInventoryDTO> getAllCustomInventories();

	Optional<ComponentInventoryDTO> getCustomInventoryById(Integer id);

	void deleteCustomInventory(Integer id);


}
