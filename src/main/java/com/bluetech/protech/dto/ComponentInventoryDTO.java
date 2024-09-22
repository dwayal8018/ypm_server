package com.bluetech.protech.dto;

import com.bluetech.protech.pojo.CustomPCBuild;
import com.bluetech.protech.pojo.PCComponent;

public class ComponentInventoryDTO {

	private Integer componentInventoryID;

	private CustomPCBuild customPCBuild;

	private PCComponent pcComponent;

	private Integer quantity;

	public Integer getComponentInventoryID() {
		return componentInventoryID;
	}

	public void setComponentInventoryID(Integer componentInventoryID) {
		this.componentInventoryID = componentInventoryID;
	}

	public CustomPCBuild getCustomPCBuild() {
		return customPCBuild;
	}

	public void setCustomPCBuild(CustomPCBuild customPCBuild) {
		this.customPCBuild = customPCBuild;
	}

	public PCComponent getPcComponent() {
		return pcComponent;
	}

	public void setPcComponent(PCComponent pcComponent) {
		this.pcComponent = pcComponent;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
