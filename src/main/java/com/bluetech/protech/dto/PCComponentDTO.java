package com.bluetech.protech.dto;

import java.util.Set;

import com.bluetech.protech.pojo.ComponentInventory;

public class PCComponentDTO {

	private Integer pcComponentID;

	private String componentModel;

	private Double price;

	private String componentType; // e.g., 'GPU', 'CPU'

//	private Set<ComponentInventoryDTO> inventories;

	public Integer getPcComponentID() {
		return pcComponentID;
	}

	public void setPcComponentID(Integer pcComponentID) {
		this.pcComponentID = pcComponentID;
	}

	public String getComponentModel() {
		return componentModel;
	}

	public void setComponentModel(String componentModel) {
		this.componentModel = componentModel;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

//	public Set<ComponentInventoryDTO> getInventories() {
//		return inventories;
//	}
//
//	public void setInventories(Set<ComponentInventoryDTO> inventories) {
//		this.inventories = inventories;
//	}

}
