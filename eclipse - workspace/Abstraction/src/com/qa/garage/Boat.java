package com.qa.garage;

public class Boat extends Vehicle{

	public Boat(int speed, int mPG,double cost) {
		super(speed, mPG, cost);
	}

	@Override
	public void move() {
		System.out.println("BWWWOOOOONNNNNGGGGGGG");		
		
	}
	public void rideOnTheSea() {
		System.out.println("IM ON A BOAT!!");
	}
	@Override
	public String toString() {
		return "Boat";
	}
}
