package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.CustomPCBuildDTO;

public interface CustomPCBuildService {

	List<CustomPCBuildDTO> createCustomPCBuild(List<CustomPCBuildDTO> customPCBuildList);

	List<CustomPCBuildDTO> getAllCustomPCBuilds();

	Optional<CustomPCBuildDTO> getCustomPCBuildById(Integer id);

	void deleteCustomPCBuild(Integer id);

}
