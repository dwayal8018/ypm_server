package com.bluetech.protech.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.CustomPCBuildDTO;
import com.bluetech.protech.dto.UserDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.CustomPCBuild;
import com.bluetech.protech.pojo.User;
import com.bluetech.protech.repository.CustomPCBuildRepository;
import com.bluetech.protech.service.CustomPCBuildService;

@Service
public class CustomPCBuildServiceImpl implements CustomPCBuildService {

	@Autowired
	private CustomPCBuildRepository customPCBuildRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<CustomPCBuildDTO> createCustomPCBuild(List<CustomPCBuildDTO> customPCBuildDTOList) {

		List<CustomPCBuild> customPCBuildList = new ArrayList<>();
		for (CustomPCBuildDTO customPCBuildDTO : customPCBuildDTOList) {
			CustomPCBuild customPCBuild = new CustomPCBuild();

			customPCBuild.setCustomPCID(customPCBuildDTO.getCustomPCID());
			customPCBuild.setBuildType(customPCBuildDTO.getBuildType());
			customPCBuild.setBudget(customPCBuildDTO.getBudget());
			customPCBuild.setBuildStatus(customPCBuildDTO.getBuildStatus());
			customPCBuild.setClient(createUserFromDTO(customPCBuildDTO.getClient()));
			customPCBuild.setTechExpert(createUserFromDTO(customPCBuildDTO.getTechExpert()));
			customPCBuild.setAdmin(createUserFromDTO(customPCBuildDTO.getAdmin()));

			// If there are components or orders to set, add those as well

			customPCBuildList.add(customPCBuild);
		}
		List<CustomPCBuild> savedBuilds = customPCBuildRepository.saveAll(customPCBuildList);
//		return mapstructImplNew.customPCBuildsToCustomPCBuildDTOs(savedBuilds);
		return savedBuilds.stream().map(mapstructImplNew::customPCBuildToCustomPCBuildDTO).collect(Collectors.toList());
	}

	private User createUserFromDTO(UserDTO userDTO) {
		if (userDTO == null) {
			return null; // Handle null cases as needed
		}
		User user = new User();
		user.setUserID(userDTO.getUserID());
		return user;
	}

	public List<CustomPCBuildDTO> getAllCustomPCBuilds() {
		List<CustomPCBuild> customPCBuilds = customPCBuildRepository.findAll();
//		return mapstructImplNew.customPCBuildsToCustomPCBuildDTOs(customPCBuilds);
		return customPCBuilds.stream().map(mapstructImplNew::customPCBuildToCustomPCBuildDTO)
				.collect(Collectors.toList());
	}

	public Optional<CustomPCBuildDTO> getCustomPCBuildById(Integer id) {
		return customPCBuildRepository.findById(id).map(mapstructImplNew::customPCBuildToCustomPCBuildDTO);
	}

	public void deleteCustomPCBuild(Integer id) {
		customPCBuildRepository.deleteById(id);
	}
}
