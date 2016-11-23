package com.example;

import javax.xml.ws.Endpoint;

public class ServicePoint {

	public static void main(String[] args){
		System.out.println("Service is starting... ");
		Endpoint.publish("http://localhost:8080/one", new Calc());
		System.out.println("Service started !!!");
	}
}
