package com.bluetech.protech.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.PCComponentDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.PCComponent;
import com.bluetech.protech.repository.PCComponentRepository;
import com.bluetech.protech.service.PCComponentService;

@Service
public class PCComponentServiceImpl implements PCComponentService {

	@Autowired
	private PCComponentRepository pcComponentRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	@Override
	public List<PCComponentDTO> createPCComponent(List<PCComponentDTO> pcComponentDTOList) {

		List<PCComponent> pcComponentList = new ArrayList<>();

		for (PCComponentDTO pcComponentDTO : pcComponentDTOList) {

			PCComponent component = new PCComponent();
			component.setComponentModel(pcComponentDTO.getComponentModel());
			component.setComponentType(pcComponentDTO.getComponentType());
//			 component.setInventories(null);
//			 component.setPcComponentID(null);
			component.setPrice(pcComponentDTO.getPrice());

			pcComponentList.add(component);
		}
		pcComponentList = pcComponentRepository.saveAll(pcComponentList);
		return mapstructImplNew.pcComponentsToPCComponentDTOs(pcComponentList);
	}

	public List<PCComponentDTO> getAllPCComponents() {
		return mapstructImplNew.pcComponentsToPCComponentDTOs(pcComponentRepository.findAll());
	}

	public Optional<PCComponentDTO> getPCComponentById(Integer id) {
		return pcComponentRepository.findById(id).map(mapstructImplNew::pCComponentToPCComponentDTO);
		
	}

	public void deletePCComponent(Integer id) {
		pcComponentRepository.deleteById(id);
	}

}
