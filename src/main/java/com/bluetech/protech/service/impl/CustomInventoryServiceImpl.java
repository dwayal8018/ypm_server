package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.ComponentInventoryDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.ComponentInventory;
import com.bluetech.protech.repository.CustomInventoryRepository;
import com.bluetech.protech.service.CustomInventoryService;

@Service
public class CustomInventoryServiceImpl implements CustomInventoryService {

	@Autowired
	private CustomInventoryRepository customInventoryRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<ComponentInventoryDTO> createCustomInventory(List<ComponentInventoryDTO> customInventory) {

		List<ComponentInventory> componentInventoryList = mapstructImplNew
				.componentInventoryDTOsToComponents(customInventory);
		componentInventoryList = customInventoryRepository.saveAll(componentInventoryList);
		return mapstructImplNew.componentsToComponentInventoryDTOs(componentInventoryList);
	}

	public List<ComponentInventoryDTO> getAllCustomInventories() {
		return customInventoryRepository.findAll().stream()
				.map(mapstructImplNew::componentInventoryToComponentInventoryDTO).collect(Collectors.toList());
	}

	public Optional<ComponentInventoryDTO> getCustomInventoryById(Integer id) {
		return customInventoryRepository.findById(id).map(mapstructImplNew::componentInventoryToComponentInventoryDTO);
	}

	public void deleteCustomInventory(Integer id) {
		customInventoryRepository.deleteById(id);
	}
}
