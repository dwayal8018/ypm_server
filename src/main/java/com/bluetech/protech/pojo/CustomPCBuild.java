package com.bluetech.protech.pojo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mas_custombuild")
public class CustomPCBuild {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "CustomPCID")
	    private Integer customPCID;

	    @Column(name = "BuildType")
	    private String buildType;

	    @Column(name = "Budget")
	    private Double budget;

	    @Column(name = "BuildStatus")
	    private String buildStatus;

	    @ManyToOne
	    @JoinColumn(name = "ClientID")
	    private User client;

	    @ManyToOne
	    @JoinColumn(name = "TechExpertID")
	    private User techExpert;

	    @ManyToOne
	    @JoinColumn(name = "AdminID")
	    private User admin;

	    @OneToMany(mappedBy = "customPCBuild")
	    private Set<ComponentInventory> components;

	    @OneToMany(mappedBy = "customPCBuild")
	    private Set<Orders> orders;

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

		public User getClient() {
			return client;
		}

		public void setClient(User client) {
			this.client = client;
		}

		public User getTechExpert() {
			return techExpert;
		}

		public void setTechExpert(User techExpert) {
			this.techExpert = techExpert;
		}

		public User getAdmin() {
			return admin;
		}

		public void setAdmin(User admin) {
			this.admin = admin;
		}

		public Set<ComponentInventory> getComponents() {
			return components;
		}

		public void setComponents(Set<ComponentInventory> components) {
			this.components = components;
		}

		public Set<Orders> getOrders() {
			return orders;
		}

		public void setOrders(Set<Orders> orders) {
			this.orders = orders;
		}

}
