package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	private String atech;
	@Autowired
	@Qualifier("laptop")
	private Laptop lap1;
	
	public Laptop getLap1() {
		return lap1;
	}

	public void setLap1(Laptop lap1) {
		this.lap1 = lap1;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAtech() {
		return atech;
	}

	public void setAtech(String atech) {
		this.atech = atech;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", atech=" + atech + ", lap1=" + lap1 + "]";
	}
	public void show()
	{
		System.out.println("in show");
		lap1.view();
	}
}
