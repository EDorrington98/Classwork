package firstProject;

import java.util.Random;

public class While {

	public static void main(String[] args) {
		int catCount = 1;
		boolean notEnoughCats = true;

		while (notEnoughCats) {

			System.out.println("Cat no." + catCount + " " + randomName());
			catCount++;

			if (catCount > 10)
				notEnoughCats = false;
		}

		System.out.println("Too many cats what do I do");

	}

	private static String randomName() {
		Random rand = new Random();
		Random rand2 = new Random();
		StringBuilder name = new StringBuilder("");
		int length = rand.nextInt(3) + 2;

		for (int i = 0; i < length; i++) {
			name.append(Character.toChars(rand2.nextInt(26) + 97));
		}
		return name.toString();
	}
}
