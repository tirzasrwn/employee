package com.tirzasrwn.app.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirzasrwn.app.employee.entity.Employee;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
