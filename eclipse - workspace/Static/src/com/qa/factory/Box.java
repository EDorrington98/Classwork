package com.qa.factory;

import java.util.ArrayList;

public class Box {
	
	public static ArrayList <Box> boxes = new ArrayList <Box>();
	private int volume;
	public Box(int volume) {
		this.setVolume(volume);
		boxes.add(this);
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	}
	
