package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.CustomPCBuild;
import com.bluetech.protech.repository.CustomPCBuildRepository;
import com.bluetech.protech.service.CustomPCBuildService;

@Service
public class CustomPCBuildServiceImpl implements CustomPCBuildService {

	  @Autowired
	    private CustomPCBuildRepository customPCBuildRepository;

	    public List<CustomPCBuild> createCustomPCBuild(List<CustomPCBuild> customPCBuildList) {
	        return customPCBuildRepository.saveAll(customPCBuildList);
	    }

	    public List<CustomPCBuild> getAllCustomPCBuilds() {
	        return customPCBuildRepository.findAll();
	    }

	    public Optional<CustomPCBuild> getCustomPCBuildById(Integer id) {
	        return customPCBuildRepository.findById(id);
	    }

	    public void deleteCustomPCBuild(Integer id) {
	        customPCBuildRepository.deleteById(id);
	    }
}
