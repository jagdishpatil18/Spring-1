package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.model.Person;

public interface PersonDAO {

	void save(Person p);
	List<Person> list();
}
