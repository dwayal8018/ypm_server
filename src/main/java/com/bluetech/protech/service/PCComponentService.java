package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.PCComponent;

public interface PCComponentService {

	List<PCComponent> createPCComponent(List<PCComponent> pcComponent);

	List<PCComponent> getAllPCComponents();

	Optional<PCComponent> getPCComponentById(Integer id);

	void deletePCComponent(Integer id);

}
