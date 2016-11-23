package com.example;

import javax.xml.ws.Endpoint;

public class ServicePoint {

	public static void main(String[] args){
		Endpoint.publish("http://localhost:8090/two", new FacilityService());
	}
}
