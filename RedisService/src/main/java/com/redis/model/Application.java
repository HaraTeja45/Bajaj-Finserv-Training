package com.redis.model;


import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "application", schema = "dmcredit")
public class Application implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long applicationkey;

	private Timestamp appdate;

	private Long appstatus;

	private Integer isactive;

	private Long lstupdateby;

	private Timestamp lstupdatedt;

	private Long prodcdl2;

	private Long parentapplicationkey;

	private Long prodcdl3;

	private Long prodtypekey;

	private Integer inprocessflg;
	
	private Integer statusapi; 
	
	private String createdBy; 
	
	private Long citykey;
	
	private Integer bflbranchkey;

	public Long getApplicationkey() {
		return applicationkey;
	}

	public void setApplicationkey(Long applicationkey) {
		this.applicationkey = applicationkey;
	}

	public Timestamp getAppdate() {
		return appdate;
	}

	public void setAppdate(Timestamp appdate) {
		this.appdate = appdate;
	}

	public Long getAppstatus() {
		return appstatus;
	}

	public void setAppstatus(Long appstatus) {
		this.appstatus = appstatus;
	}

	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}

	public Long getLstupdateby() {
		return lstupdateby;
	}

	public void setLstupdateby(Long lstupdateby) {
		this.lstupdateby = lstupdateby;
	}

	public Timestamp getLstupdatedt() {
		return lstupdatedt;
	}

	public void setLstupdatedt(Timestamp lstupdatedt) {
		this.lstupdatedt = lstupdatedt;
	}

	public Long getProdcdl2() {
		return prodcdl2;
	}

	public void setProdcdl2(Long prodcdl2) {
		this.prodcdl2 = prodcdl2;
	}

	public Long getParentapplicationkey() {
		return parentapplicationkey;
	}

	public void setParentapplicationkey(Long parentapplicationkey) {
		this.parentapplicationkey = parentapplicationkey;
	}

	public Long getProdcdl3() {
		return prodcdl3;
	}

	public void setProdcdl3(Long prodcdl3) {
		this.prodcdl3 = prodcdl3;
	}

	public Long getProdtypekey() {
		return prodtypekey;
	}

	public void setProdtypekey(Long prodtypekey) {
		this.prodtypekey = prodtypekey;
	}

	public Integer getInprocessflg() {
		return inprocessflg;
	}

	public void setInprocessflg(Integer inprocessflg) {
		this.inprocessflg = inprocessflg;
	}

	public Integer getStatusapi() {
		return statusapi;
	}

	public void setStatusapi(Integer statusapi) {
		this.statusapi = statusapi;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Long getCitykey() {
		return citykey;
	}

	public void setCitykey(Long citykey) {
		this.citykey = citykey;
	}

	public Integer getBflbranchkey() {
		return bflbranchkey;
	}

	public void setBflbranchkey(Integer bflbranchkey) {
		this.bflbranchkey = bflbranchkey;
	}
	
	
	
	

	
	
	

}