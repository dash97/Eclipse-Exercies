package com.amdocs;

public class CarFactory {
	
	public static ICar getCar (String typeOfCar) {
		ICar car = null;
		
	
		
		if (typeOfCar.equals("Maruti"))
			car = new Maruti();
		else if (typeOfCar.equals("Audi"))
			car = new Audi();
		else
			car = new NullCar();
		
		return car;
	}

}
