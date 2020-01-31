package com.qa.circus;

public class Application {

	public static void main(String[] args) {
		Elephant dumbo = new Elephant();
		Elephant nellie = new Elephant();
		Elephant bwipo = new Elephant("Gamer", "Sparkles", 24000);
		Elephant poop = new Elephant(species, colour, legs)
		nellie.legs = 4;
		dumbo.species = "asian";
		dumbo.colour = "grey";
		dumbo.legs = 12;
		System.out.println(nellie.legs);
		System.out.println(dumbo.colour);
		System.out.println(dumbo.legs);
		dumbo.haveMudBath();
		System.out.println(dumbo.colour);
		dumbo.getPainted("Blue");
		System.out.println(dumbo.colour);
		System.out.println(dumbo.alive);
		System.out.println(nellie.alive);
		dumbo.getDeaded();
		nellie.getDeaded();
		System.out.println(bwipo.toString());
//		System.out.println(dumbo.alive);
//		System.out.println(nellie.alive);

	}
}
