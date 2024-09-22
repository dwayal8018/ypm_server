package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.CustomPCBuild;

public interface CustomPCBuildService {

	List<CustomPCBuild> createCustomPCBuild(List<CustomPCBuild> customPCBuildList);

	List<CustomPCBuild> getAllCustomPCBuilds();

	Optional<CustomPCBuild> getCustomPCBuildById(Integer id);

	void deleteCustomPCBuild(Integer id);

}
