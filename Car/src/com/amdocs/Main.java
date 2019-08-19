package com.amdocs;

public class Main {

	public static void main(String[] args) {
				
		ICar car = CarFactory.getCar("BMW");
		
		ICar.drive();
		
	}

}
