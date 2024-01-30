package com.tirzasrwn.app.employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tirzasrwn.app.employee.entity.Employee;
import com.tirzasrwn.app.employee.service.EmployeeService;

/**
 * null
 * EmployeeRestController
 */
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeService employeeService;

  // Inject employee dao using constructor injection.
  @Autowired
  public EmployeeRestController(EmployeeService theEmployeeService) {
    employeeService = theEmployeeService;
  }

  // Expose "/employees" and return list of employees.
  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeService.findAll();
  }
}
