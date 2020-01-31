package com.qa.garage;

public class Bicycle extends Vehicle {
	

	public Bicycle(int speed, int mPG,double cost) {
		super(speed, mPG, cost);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void move() {
		System.out.println("squeak");
	
	}
	public void rideInSkatepark() {
		System.out.println("He was a sk8ter boi!");
	}
	@Override
	public String toString() {
		return "Bicycle";
	}
}
