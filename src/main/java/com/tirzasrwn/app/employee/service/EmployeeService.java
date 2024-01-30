package com.tirzasrwn.app.employee.service;

import java.util.List;

import com.tirzasrwn.app.employee.entity.Employee;

/**
 * EmployeeService
 */
public interface EmployeeService {

  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);
}
