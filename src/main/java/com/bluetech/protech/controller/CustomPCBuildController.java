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

import com.bluetech.protech.pojo.CustomPCBuild;
import com.bluetech.protech.service.CustomPCBuildService;

@RestController
@RequestMapping("/api/custom-pc-builds")
public class CustomPCBuildController {

	 @Autowired
	    private CustomPCBuildService customPCBuildService;

	    @PostMapping
	    public List<CustomPCBuild> createCustomPCBuild(@RequestBody List<CustomPCBuild> customPCBuildList) {
	        return customPCBuildService.createCustomPCBuild(customPCBuildList);
	    }

	    @GetMapping
	    public List<CustomPCBuild> getAllCustomPCBuilds() {
	        return customPCBuildService.getAllCustomPCBuilds();
	    }

	    @GetMapping("/{id}")
	    public Optional<CustomPCBuild> getCustomPCBuildById(@PathVariable Integer id) {
	        return customPCBuildService.getCustomPCBuildById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCustomPCBuild(@PathVariable Integer id) {
	        customPCBuildService.deleteCustomPCBuild(id);
	    }
}
