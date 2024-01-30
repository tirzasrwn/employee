package com.tirzasrwn.app.employee.dao;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tirzasrwn.app.employee.entity.Employee;

/**
 * EmployeeDAOJpaImpl
 */
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
  // Define fileds for entitymanager.
  private EntityManager entityManager;

  // Set up constructor injection.
  @Autowired
  public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
    entityManager = theEntityManager;
  }

  @Override
  public List<Employee> findAll() {
    // Create a query.
    TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
    // Execute the query;
    List<Employee> employees = theQuery.getResultList();

    return employees;
  }

}
