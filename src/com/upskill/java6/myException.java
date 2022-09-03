package com.upskill.java6;

public class myException extends Exception{

	String a;
	
	public myException (String b){
		a = b;
		
	}
	
	public String Upskill(){
		return ("This is Defined Exception : " + a);

	}

}
