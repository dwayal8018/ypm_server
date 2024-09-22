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

import com.bluetech.protech.pojo.PCComponent;
import com.bluetech.protech.service.PCComponentService;

@RestController
@RequestMapping("/api/pc-components")
public class PCComponentController {

	  @Autowired
	    private PCComponentService pcComponentService;

	    @PostMapping
	    public List<PCComponent> createPCComponent(@RequestBody List<PCComponent> pcComponentList) {
	        return pcComponentService.createPCComponent(pcComponentList);
	    }

	    @GetMapping
	    public List<PCComponent> getAllPCComponents() {
	        return pcComponentService.getAllPCComponents();
	    }

	    @GetMapping("/{id}")
	    public Optional<PCComponent> getPCComponentById(@PathVariable Integer id) {
	        return pcComponentService.getPCComponentById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePCComponent(@PathVariable Integer id) {
	        pcComponentService.deletePCComponent(id);
	    }
}
