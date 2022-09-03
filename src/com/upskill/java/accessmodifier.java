package com.upskill.java;

public class accessmodifier {

	public String name = "Shaekh";   // public - any class can access
			
	private int age = 55;          // private - only same class can access
	
	protected int ssn = 123456789;   // protected - classes in the same package and subclass
			
	     String address = "Heritage tower";  // default - classes in same package can access
	    	     
	     	
	     
	     
	     public static void main[] args){
	    	 System.out.println("Haritage tower");  //When we will print any string,under System.out.println
	     }                                          // Then the string's word or sentence should must be under("")
}
