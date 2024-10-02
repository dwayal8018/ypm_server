package com.bluetech.protech.dto;

public class CustomPCBuildDTO {

	private Integer customPCID;
	private String buildType;
	private Double budget;
	private String buildStatus;
	private UserDTO client;
	private UserDTO techExpert;
	private UserDTO admin;

	public Integer getCustomPCID() {
		return customPCID;
	}

	public void setCustomPCID(Integer customPCID) {
		this.customPCID = customPCID;
	}

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public String getBuildStatus() {
		return buildStatus;
	}

	public void setBuildStatus(String buildStatus) {
		this.buildStatus = buildStatus;
	}

	public UserDTO getClient() {
		return client;
	}

	public void setClient(UserDTO client) {
		this.client = client;
	}

	public UserDTO getTechExpert() {
		return techExpert;
	}

	public void setTechExpert(UserDTO techExpert) {
		this.techExpert = techExpert;
	}

	public UserDTO getAdmin() {
		return admin;
	}

	public void setAdmin(UserDTO admin) {
		this.admin = admin;
	}

}
