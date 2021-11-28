package com.wavelab.demo;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Employ {
	@Id
	private int eid;
	private String ename;
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

	public String getEtech() {
		return tech;
	}

	public void setEtech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", ename=" + ename + ", tech=" + tech + "]";
	}

}
