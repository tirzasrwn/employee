package com.tirzasrwn.app.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tirzasrwn.app.employee.dao.EmployeeRepository;
import com.tirzasrwn.app.employee.entity.Employee;

/**
 * EmployeeServiceImpl
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
    employeeRepository = theEmployeeRepository;
  }

  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee findById(int theId) {
    Optional<Employee> result = employeeRepository.findById(theId);
    if (result.isPresent()){
      return result.get();
    }
    return null;
  }

  @Override
  public Employee save(Employee theEmployee) {
    return employeeRepository.save(theEmployee);
  }

  @Override
  public void deleteById(int theId) {
    employeeRepository.deleteById(theId);
  }
}
