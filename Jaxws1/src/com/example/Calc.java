package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="MyCalcService", name="MyName",portName="MyPort",targetNamespace="MyCalc.com")
public class Calc {

	@WebMethod(operationName="addition" )
	public int add(int a, int b){
		return a+b;
	}
	
	@WebMethod(operationName="division" )
	public int divide(String a, String b) throws MyException{
		try{
			int i=Integer.parseInt(a);
			int j=Integer.parseInt(b);
			return i/j;
		}
		catch(NumberFormatException e1){
			throw new MyException("Args should be of Integers", 4);
		}
		catch(ArithmeticException e2){
			throw new MyException("Second argument should be non zero", 6);
		}
			
	}
	
}
