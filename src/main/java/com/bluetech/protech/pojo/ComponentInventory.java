package com.bluetech.protech.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mas_componentInventory")
public class ComponentInventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ComponentInventoryID")
	private Integer componentInventoryID;

	@ManyToOne
	@JoinColumn(name = "CustomPCID")
	private CustomPCBuild customPCBuild;

	@ManyToOne
	@JoinColumn(name = "PCComponentID")
	private PCComponent pcComponent;

	@Column(name = "Quantity")
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
