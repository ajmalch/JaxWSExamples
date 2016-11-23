package com.example;


import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName="FacilitySOAPService")
public class FacilityService {

	public @WebResult(name="myFacility") Facility getFacility(){
		return new Facility();
		
	}
	
}
