package com.upskill.java5;

public abstract class Abstractclass {

	//Abstract class has both abstract method and regular method
	
	//Abstract method
	
	public abstract void iDoor();
	public abstract void iWheel();
	public abstract String iEngine();
	public abstract int iSeat();

	//Non abstract or regular method
	
	public void brand(){
		String brand = "BMW";
		
	}
	public String color(){
		String colors = "Black";
		return colors;
	}

}
