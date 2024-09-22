package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.PCComponent;
import com.bluetech.protech.repository.PCComponentRepository;
import com.bluetech.protech.service.PCComponentService;

@Service
public class PCComponentServiceImpl implements PCComponentService {

	 @Autowired
	    private PCComponentRepository pcComponentRepository;

	    public List<PCComponent> createPCComponent(List<PCComponent> pcComponent) {
	        return pcComponentRepository.saveAll(pcComponent);
	    }

	    public List<PCComponent> getAllPCComponents() {
	        return pcComponentRepository.findAll();
	    }

	    public Optional<PCComponent> getPCComponentById(Integer id) {
	        return pcComponentRepository.findById(id);
	    }

	    public void deletePCComponent(Integer id) {
	        pcComponentRepository.deleteById(id);
	    }
}
