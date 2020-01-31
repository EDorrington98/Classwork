package com.qa.garage;

	public class Car extends Vehicle{
		
		
		public Car(int speed, int mPG,double cost) {
			super(speed, mPG, cost);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void move() {
			System.out.println("brummmmmmmm");
		
		}
		public void rideOnHighway() {
			System.out.println("HIGHWAY TO HELL!!!");
		}
		@Override
		public String toString() {
			return "Car";
		}
}
