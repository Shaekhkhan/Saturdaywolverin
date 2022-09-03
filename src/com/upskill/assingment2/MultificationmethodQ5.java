package com.upskill.assingment2;

public class MultificationmethodQ5 {

public static void main(String[] args) {
		
		myMethod();
	}

	public static void myMethod() {
	
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}
}

