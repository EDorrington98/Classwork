package com.qa.circus;

public class Elephant {
	String species;
	String colour;
	int legs;
	Boolean alive = true;
	/**This creates a new Elephant
	 * 
	 * @param species this is the species of the Elephant
	 * @param colour this is the colour of the Elephant
	 * @param legs how many legs the Elephant has
	 */
	public Elephant(String species, String colour, int legs) {
		this.species = species;
		this.colour = colour;
		this.legs = legs;
	}
	public void haveMudBath() {
		colour = "brown";
	}
	public String toString() {
		return species + " " + colour + " " + legs;
	}

	public void getPainted(String paint) {
		colour = paint;
	}
	public void getDeaded(){
		alive = false;
		System.out.println("Got yeeted RIP");
	}

}
