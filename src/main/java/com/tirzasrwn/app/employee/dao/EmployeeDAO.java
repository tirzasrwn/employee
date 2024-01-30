package com.tirzasrwn.app.employee.dao;

import java.util.List;

import com.tirzasrwn.app.employee.entity.Employee;

public interface EmployeeDAO {

  List<Employee> findAll();
}
