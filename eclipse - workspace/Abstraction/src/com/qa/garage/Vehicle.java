package com.qa.garage;

public abstract class Vehicle {
	public abstract void move();
	

	private int speed;
	private int mPG;
	private double cost;
	private String name;

	public Vehicle(int speed, int mPG,double cost) {
		this.speed = speed;
		this.mPG = mPG;
		this.cost = cost;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getMPG() {
		return mPG;
	}

	public void setMPG(int mPG) {
		this.mPG = mPG;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	


}
