package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.ComponentInventoryDTO;
import com.bluetech.protech.service.CustomInventoryService;

@RestController
@RequestMapping("/api/custom-inventory")
public class CustomInventoryController {

	 @Autowired
	    private CustomInventoryService customInventoryService;

	    @PostMapping
	    public ResponseEntity<List<ComponentInventoryDTO>> createCustomInventory(@RequestBody ComponentInventoryDTO customInventoryList) {
	        List<ComponentInventoryDTO> createdInventories = customInventoryService.createCustomInventory(Arrays.asList(customInventoryList));
	        return new ResponseEntity<>(createdInventories, HttpStatus.CREATED);
	    }
//	    @PostMapping
//	    public ResponseEntity<List<ComponentInventoryDTO>> createCustomInventoryc(@RequestBody List<ComponentInventoryDTO> customInventoryList) {
//	    	List<ComponentInventoryDTO> createdInventories = customInventoryService.createCustomInventory(customInventoryList);
//	    	return new ResponseEntity<>(createdInventories, HttpStatus.CREATED);
//	    }

	    @GetMapping
	    public ResponseEntity<List<ComponentInventoryDTO>> getAllCustomInventories() {
	        List<ComponentInventoryDTO> inventories = customInventoryService.getAllCustomInventories();
	        return new ResponseEntity<>(inventories, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<ComponentInventoryDTO> getCustomInventoryById(@PathVariable Integer id) {
	        Optional<ComponentInventoryDTO> inventory = customInventoryService.getCustomInventoryById(id);
	        return inventory.map(componentInventory -> new ResponseEntity<>(componentInventory, HttpStatus.OK))
	                        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCustomInventory(@PathVariable Integer id) {
	        customInventoryService.deleteCustomInventory(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
}
