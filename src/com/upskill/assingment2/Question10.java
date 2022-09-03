package com.upskill.assingment2;

import java.util.Scanner;

public class Question10 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("100: ");
		double a = s.nextInt();
		s.close();
		myMethod(a);
	}
	public static void myMethod(double a){
		double fahrenheit = 0;
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;

		System.out.println("37: ");
		System.out.println(celsius);
	}
}

