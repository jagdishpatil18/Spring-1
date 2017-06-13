package com.bridgeit.Spring4HibernateExample.service;

import java.util.List;

import com.bridgeit.Spring4HibernateExample.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);
	 
    List<Employee> findAllEmployees();
 
    void deleteEmployeeBySsn(String ssn);
 
    Employee findBySsn(String ssn);
 
    void updateEmployee(Employee employee);
}
