package com.wavelab.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.wavelab.demo.Employ;

@Component
public interface EmployRepo extends JpaRepository<Employ, Integer> {

	//Employ findByTech(String tech);

	//List<Employ> findByIdGreaterThan(int eid);

	//List<Employ> findByTechSorted(String string);

}
