package com.upskill.java6;

public class Singleton {
	
	//Singleton is class that have only one object
	//private constructor, it prevants any other class from instance
	private Singleton(){
		
		
	}
	
	//private static object of the class
	private static Singleton Singletonobj = new Singleton();
	
	//Static instance method
	public static Singleton getInstance(){
		return Singletonobj;
	}
	protected static void demo(){
		System.out.println("Demo method for sigleton class");
	}
	

}
