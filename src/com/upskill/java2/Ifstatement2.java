package com.upskill.java2;

public class Ifstatement2 {

		
		static int salary = 8700;

		public static void main(String[] args) {
			salary();
		}
		
		//If Else Statement
		public static void salary(){
			
			if (salary < 3000){
				System.out.println("You are get minimum salary");
			} else if (salary > 3000 && salary < 8900){
				System.out.println("You are get medium salary");
			} else if (salary >= 9900) {
				//Nested If Else Statement
				if(salary >10000){
					System.out.println("You are get maximum salary");
				} else {
					System.out.println("You are get maximum salary");
				}
			} else {
				System.out.println("You are get meximum");
			}
		}
	}
