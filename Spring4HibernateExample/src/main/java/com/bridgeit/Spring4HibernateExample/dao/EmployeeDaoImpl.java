package com.bridgeit.Spring4HibernateExample.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bridgeit.Spring4HibernateExample.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	public void saveEmployee(Employee employee) {
		System.out.println(employee);
        persist(employee);
    }
 
    public List<Employee> findAllEmployees() {
        Criteria criteria = getSession().createCriteria(Employee.class);
        return (List<Employee>) criteria.list();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from EMPLOYEE where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
    public Employee findBySsn(String ssn){
        Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("ssn",ssn));
        return (Employee) criteria.uniqueResult();
    }
     
    public void updateEmployee(Employee employee){
        getSession().update(employee);
    }
}
