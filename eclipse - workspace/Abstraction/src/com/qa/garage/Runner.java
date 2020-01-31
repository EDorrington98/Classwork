package com.qa.garage;

public class Runner {
	public static void main(String[] args) {
		Vehicle car = new Car(0, 0, 0.00);
		Vehicle bicycle = new Bicycle(0, 0, 0.00);
		Vehicle boat = new Boat(0, 0, 0.00);
		Garage garage = new Garage();
		garage.addVehicle(car);
		boat.move();
		bicycle.move();
		car.move();
		garage.toString();
	
		
		

	}

	
	
}
