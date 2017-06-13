package com.bridgeit.Spring4AutoScanning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.Spring4AutoScanning.dao.EmployeeDao;
import com.bridgeit.Spring4AutoScanning.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
 
    @Autowired
    private DateService dateService;
     
    @Autowired
    private EmployeeDao employeeDao;
     
    public void registerEmployee(Employee employee) {
        employee.setAssessmentDate(dateService.getNextAssessmentDate());
        employeeDao.saveInDatabase(employee);
    }
     
}