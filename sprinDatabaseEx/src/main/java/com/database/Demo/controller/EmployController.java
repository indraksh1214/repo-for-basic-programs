package com.database.Demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.Demo.bean.Employ;
import com.database.Demo.dao.EmployService;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;

@RestController
@RequestMapping("/api")
public class EmployController {
	
	@Autowired
	private EmployService service;
	
	@PostMapping("/addemploy")
	public void addEmploy(Employ employ)
	{
		service.saveEmploy(employ);
	}
	
	@GetMapping("/Employes")
	@ApiOperation(value = "getting details of all the employers ",
	notes = "ntg to provide it will returns all the employers",
	response =Employ.class )
	public List<Employ> GetEmployes()
	{
		return service.findEmployes();
	}
	
	@GetMapping("/Employ/{eid}")
	public Optional<Employ> GetEmploye(@PathVariable("eid") int eid)
	{
		return service.findEmploy(eid);
	}
}
