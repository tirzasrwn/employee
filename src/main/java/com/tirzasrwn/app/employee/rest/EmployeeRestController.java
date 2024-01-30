package com.tirzasrwn.app.employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tirzasrwn.app.employee.entity.Employee;
import com.tirzasrwn.app.employee.service.EmployeeService;

/**
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

  // Add mapping for GET /employees/{employeeId} to get a single employee by id.
  @GetMapping("/employees/{employeeId}")
  public Employee getEmployee(@PathVariable int employeeId) {
    Employee dbEmployee = employeeService.findById(employeeId);
    if (dbEmployee == null) {
      throw new RuntimeException(String.format("Employe with id %d not found!", employeeId));
    }
    return dbEmployee;
  }

  // Add mapping for POST /employees to add new employee.
  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee theEmployee) {
    // Set the id to zero to force it to save.
    theEmployee.setId(0);
    Employee dbEmployee = employeeService.save(theEmployee);
    return dbEmployee;
  }

  // Add mapping for PUT /employees - update existing employee.
  @PutMapping("/employees")
  public Employee updateEmployee(@RequestBody Employee theEmployee) {
    Employee dbEmployee = employeeService.save(theEmployee);
    return dbEmployee;
  }
}
