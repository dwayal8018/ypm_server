package com.bluetech.protech.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mydemo")
public class MyDemo {
//
//	Integer id;
//	String name;
//	String category;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//
//	@Column(name = "id", unique = true, nullable = false)
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	@Column(name = "name", length = 200)
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Column(name = "category", length = 200)
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Country", length = 50)
    private String country;

    @Column(name = "Year")
    private Integer year;

    @Column(name = "Mileage")
    private Integer mileage;

    @Column(name = "Zone")
    private Integer zone;

    @Column(name = "Value")
    private Integer value;

    @Column(name = "Stby_Discount", length = 10)
    private String stbyDiscount;

    @Column(name = "ZEW")
    private Integer zew;

    @Column(name = "enable")
    private boolean enable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public Integer getZone() {
		return zone;
	}

	public void setZone(Integer zone) {
		this.zone = zone;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getStbyDiscount() {
		return stbyDiscount;
	}

	public void setStbyDiscount(String stbyDiscount) {
		this.stbyDiscount = stbyDiscount;
	}

	public Integer getZew() {
		return zew;
	}

	public void setZew(Integer zew) {
		this.zew = zew;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
    
    
    

}
