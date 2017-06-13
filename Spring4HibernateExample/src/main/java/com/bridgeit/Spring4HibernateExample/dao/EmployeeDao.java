package com.bridgeit.Spring4HibernateExample.dao;

import java.util.List;

import com.bridgeit.Spring4HibernateExample.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
    
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
}
