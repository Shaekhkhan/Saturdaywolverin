package com.upskill.java5;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";  // write and read
	private int ssn = 123456923;     //write only
	private String username ="Shaekh khan";   //read only

			
	//setter method
			public void setName(String value){  //set the data
				name = value;
			}
			
			//Getter method
			public String getName(){
				return name;
			}
			

			//setter method ssn
			public void setSSN(int value){
				ssn = value;
				
			}
			
			//Getter method - username
			public String getUserName(){
				return username;
	
			}
	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setName("shaekh");
		obj.getName();
		obj.setSSN(45678);
		obj.getUserName();
		System.out.println(obj.getUserName());
		
	
		
		
		}

	}


