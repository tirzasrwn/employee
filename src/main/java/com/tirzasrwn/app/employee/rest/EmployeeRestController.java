package com.tirzasrwn.app.employee.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tirzasrwn.app.employee.dao.EmployeeDAO;
import com.tirzasrwn.app.employee.entity.Employee;

/**
 * EmployeeRestController
 */
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeDAO employeeDAO;

  // Inject employee dao using constructor injection.
  public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
    employeeDAO = theEmployeeDAO;
  }

  // Expose "/employees" and return list of employees.
  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }
}
