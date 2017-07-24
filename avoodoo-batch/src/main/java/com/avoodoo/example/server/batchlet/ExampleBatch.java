package com.avoodoo.example.server.batchlet;

import java.time.LocalDate;
import java.util.Map;

import javax.inject.Named;

@Named("exampleBatch")
public class ExampleBatch extends AbstractAvoodooBatchlet {

	@Override
	public String process(LocalDate accrualDate, Map<String, String> overrideParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
