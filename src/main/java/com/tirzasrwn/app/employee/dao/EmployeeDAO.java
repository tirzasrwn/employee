package com.tirzasrwn.app.employee.dao;

import java.util.List;

import com.tirzasrwn.app.employee.entity.Employee;

public interface EmployeeDAO {

  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);
}
