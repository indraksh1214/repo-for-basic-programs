package com.database.Demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.database.Demo.bean.Employ;

@Component
public interface EmployRepository extends JpaRepository<Employ,Integer> {

}
