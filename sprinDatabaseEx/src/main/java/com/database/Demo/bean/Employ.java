package com.database.Demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Details about the employes")
public class Employ {
	@Id
	@ApiModelProperty(notes=" the unique id of the employ")
	private int eid;
	@ApiModelProperty(notes=" name of the employ")
	private String ename;
	@ApiModelProperty(notes=" tech of the employ")
	private String tech;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

}
