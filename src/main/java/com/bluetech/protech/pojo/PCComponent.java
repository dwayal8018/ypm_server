package com.bluetech.protech.pojo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mas_pcComponent")
public class PCComponent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PCComponentID")
	private Integer pcComponentID;

	@Column(name = "ComponentModel")
	private String componentModel;

	@Column(name = "Price")
	private Double price;

	@Column(name = "ComponentType")
	private String componentType; // e.g., 'GPU', 'CPU'

	@OneToMany(mappedBy = "pcComponent")
	private Set<ComponentInventory> inventories;

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

	public Set<ComponentInventory> getInventories() {
		return inventories;
	}

	public void setInventories(Set<ComponentInventory> inventories) {
		this.inventories = inventories;
	}

}
