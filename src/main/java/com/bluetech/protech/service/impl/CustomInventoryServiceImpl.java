package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.ComponentInventory;
import com.bluetech.protech.repository.CustomInventoryRepository;
import com.bluetech.protech.service.CustomInventoryService;

@Service
public class CustomInventoryServiceImpl implements CustomInventoryService {


    @Autowired
    private CustomInventoryRepository customInventoryRepository;

    public List<ComponentInventory> createCustomInventory(List<ComponentInventory> customInventory) {
        return customInventoryRepository.saveAll(customInventory);
    }

    public List<ComponentInventory> getAllCustomInventories() {
        return customInventoryRepository.findAll();
    }

    public Optional<ComponentInventory> getCustomInventoryById(Integer id) {
        return customInventoryRepository.findById(id);
    }

    public void deleteCustomInventory(Integer id) {
        customInventoryRepository.deleteById(id);
    }
}
