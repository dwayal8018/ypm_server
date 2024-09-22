package com.bluetech.protech.pojo;
// Generated Aug 19, 2024, 4:31:59 PM by Hibernate Tools 4.3.6.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * TbAirlineFxRates generated by hbm2java
 */
@Entity
@Table(name = "tb_airline_fx_rates", catalog = "airline")
public class TbAirlineFxRates implements java.io.Serializable {

	private Integer id;
	private Date updatedOn;
	private String sourceCurrency;
	private String currency;
	private Double fxRate;
	private boolean enable;
	private Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailses = new HashSet<TbAirlineTravelexpensedetails>(
			0);

	public TbAirlineFxRates() {
	}

	public TbAirlineFxRates(boolean enable) {
		this.enable = enable;
	}

	public TbAirlineFxRates(Date updatedOn, String sourceCurrency, String currency, Double fxRate, boolean enable,
			Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailses) {
		this.updatedOn = updatedOn;
		this.sourceCurrency = sourceCurrency;
		this.currency = currency;
		this.fxRate = fxRate;
		this.enable = enable;
		this.tbAirlineTravelexpensedetailses = tbAirlineTravelexpensedetailses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedOn", length = 19)
	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name = "sourceCurrency", length = 100)
	public String getSourceCurrency() {
		return this.sourceCurrency;
	}

	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	@Column(name = "currency", length = 100)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "fxRate", precision = 22, scale = 0)
	public Double getFxRate() {
		return this.fxRate;
	}

	public void setFxRate(Double fxRate) {
		this.fxRate = fxRate;
	}

	@Column(name = "enable", nullable = false)
	public boolean isEnable() {
		return this.enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbAirlineFxRates")
	public Set<TbAirlineTravelexpensedetails> getTbAirlineTravelexpensedetailses() {
		return this.tbAirlineTravelexpensedetailses;
	}

	public void setTbAirlineTravelexpensedetailses(Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailses) {
		this.tbAirlineTravelexpensedetailses = tbAirlineTravelexpensedetailses;
	}

}
