package com.bluetech.protech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.pojo.ComponentInventory;
import com.bluetech.protech.service.CustomInventoryService;

@RestController
@RequestMapping("/api/custom-inventory")
public class CustomInventoryController {

	  @Autowired
	    private CustomInventoryService customInventoryService;

	    @PostMapping
	    public List<ComponentInventory> createCustomInventory(@RequestBody List<ComponentInventory> customInventoryList) {
	        return customInventoryService.createCustomInventory(customInventoryList);
	    }

	    @GetMapping
	    public List<ComponentInventory> getAllCustomInventories() {
	        return customInventoryService.getAllCustomInventories();
	    }

	    @GetMapping("/{id}")
	    public Optional<ComponentInventory> getCustomInventoryById(@PathVariable Integer id) {
	        return customInventoryService.getCustomInventoryById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCustomInventory(@PathVariable Integer id) {
	        customInventoryService.deleteCustomInventory(id);
	    }
}
