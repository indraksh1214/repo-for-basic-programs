package com.database.Demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.database.Demo.bean.Employ;

@Component
public class EmployService {
	
	@Autowired
	private EmployRepository repo;
	
	public List<Employ> findEmployes()
	{
		return repo.findAll();
	}

	public Optional<Employ> findEmploy(int eid)
	{
		return repo.findById(eid);
	}
	
	public void saveEmploy(Employ employ)
	{
		repo.save(employ);
	}
}
