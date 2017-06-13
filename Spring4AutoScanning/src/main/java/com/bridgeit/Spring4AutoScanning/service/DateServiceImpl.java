package com.bridgeit.Spring4AutoScanning.service;


import org.springframework.stereotype.Service;

@Service("dateService")
public class DateServiceImpl implements DateService{

	public org.joda.time.LocalDate getNextAssessmentDate() {
		// TODO Auto-generated method stub
		return new org.joda.time.LocalDate(2015,10,10);
	}

}
