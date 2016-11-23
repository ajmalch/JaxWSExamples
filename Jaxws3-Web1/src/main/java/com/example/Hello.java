package com.example;

import javax.jws.WebService;

@WebService
public class Hello {

	public String sayHello(String s){
		return ("Hello "+ s);
	
	}
	
}
