package com.tirzasrwn.app.employee.service;

import java.util.List;

import com.tirzasrwn.app.employee.entity.Employee;

/**
 * EmployeeService
 */
public interface EmployeeService {

  List<Employee> findAll();
}
