package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.PCComponentDTO;

public interface PCComponentService {

	List<PCComponentDTO> createPCComponent(List<PCComponentDTO> pcComponentList);

	List<PCComponentDTO> getAllPCComponents();

	Optional<PCComponentDTO> getPCComponentById(Integer id);

	void deletePCComponent(Integer id);

}
