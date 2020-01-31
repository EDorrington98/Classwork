package firstProject;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println("Is " + a + " divisible by " + b + "? " + " : " + isDivisible(a, b));
//		int num = 22;
//		if (num %2 == 0) System.out.println("EVEN");
//		else System.out.println("ODD");
//		
//		
//		System.out.println(++num);
//		System.out.println(num);
//		char letter = 'e';
//		letter++;
//		System.out.println(letter);
		if (isDivisible(a, b))
			System.out.println("wooo!");
		else
			System.out.println("booooo!");

		for (int count = 1; count <= 20; count++) {
			System.out.println("Is 100 divisible by " + count + "? " + " : " + isDivisible(100, count));
		}
	}

	public static boolean isDivisible(int num, int divider) {

		return num % divider == 0;

	}
//	private int birthday (int age) {
//		age = age + 1;
//		return age;
}
