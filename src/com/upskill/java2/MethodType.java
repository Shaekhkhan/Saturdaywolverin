package com.upskill.java2;

public class MethodType {
	
	/* 	Types of Methods
	 * 
	 
  			1.Void Method
   			2.Static Method
   			3.Return Type Method   */
	
	public static int hourlyIncome = 70;

	public static void main(String[] args) {
		MethodType myObj = new MethodType();										//Creating Class object
		myObj.annualIncomeVoid();													//calling Void method
		
		weeklyIncomeStatic();														//calling Static method
		
		System.out.println("My Monthly Income = " + myObj.monthlyIncomeReturn());	//calling Return method
	}
	
	//void Method
	public void annualIncomeVoid(){
		int annualIncome = hourlyIncome * 2000;                        //here 2000 is hour
		System.out.println("My Annual Income = " + annualIncome);
	}
	
	//static Method
	public static void weeklyIncomeStatic(){
		int weeklyIncome = hourlyIncome * 50;                        // 50 hours in a week
		System.out.println("My Weekly Income = " + weeklyIncome);
	}

	//return type Method
	public int monthlyIncomeReturn(){
		int monthlyIncome = hourlyIncome * 180;                     //180 hours in a month
		return monthlyIncome;
	}
}

// Test git