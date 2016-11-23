package com.example;

public class MyException extends Exception {

	private static final long serialVersionUID=100000L;
	
	private int severityLevel;
	
	public MyException(){
		super();
	}
	
	public MyException(String s){
		super(s);
	}
	public MyException(String s, int sevlevel){
		super(s);
		this.severityLevel=sevlevel;
	}

	public int getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(int severityLevel) {
		this.severityLevel = severityLevel;
	}
	
	
	
}
