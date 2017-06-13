package com.bridgeit.Spring4HibernateExample.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.Spring4HibernateExample.model.Employee;

public abstract class AbstractDao {

	 @Autowired
	    private SessionFactory sessionFactory;
	 
	    protected Session getSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	    public void persist(Employee entity) {
	        getSession().persist(entity);
	    }
	 
	    public void delete(Object entity) {
	        getSession().delete(entity);
	    }
}
