package com.upskill.assingment2;

public class IfelseQ2 {
  static int marks = 70;
	public static void main(String[] args) {
		 
		marks();

	}

	public static void marks() {

		if (marks>=90 && marks<=100){
			System.out.println("Grade A");}
		else if (marks>=80 && marks<=89){
			System.out.println("Grade B");}
		else if (marks>=70 && marks<=79){
			System.out.println("Grade C");}
		else if (marks>=60 && marks<=69){
			System.out.println("Grade D");}
		else if (marks<60){
			System.out.println("Fail");}
		else {
			System.out.println("Invalid Marks");}

	}
}


