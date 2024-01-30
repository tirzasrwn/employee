package com.tirzasrwn.app.employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  // Add mapping for POST /employee to add new employee.
  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee theEmployee) {
    // Set the id to zero to force it to save.
    theEmployee.setId(0);
    Employee dbEmployee = employeeService.save(theEmployee);
    return dbEmployee;
  }

  // Add mapping for PUT /employee - update existing employee.
  @PutMapping("/employees")
  public Employee updateEmployee(@RequestBody Employee theEmployee) {
    Employee dbEmployee = employeeService.save(theEmployee);
    return dbEmployee;
  }
}
