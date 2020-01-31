package firstProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
//		String[][] room = {{"Doug", "Josh", "Sam", "Jeevan"},{"Nisha","Laurence","Ashima"},{"Mumba", "prem"}};
//		System.out.println(row2[2]);
//		System.out.println(Arrays.deepToString(room));
//		System.out.println(room[0][1]+ " " + room[1][2]+ " " + room[2][0]);
//		room[1][1] = "jess";
//		System.out.println(room[1][1]);
		ArrayList<String> row5 = new ArrayList<String>();
		row5.add("Laurence");
		row5.add("Nisha");
		row5.add("Jess");
//		row5.stream().forEach(name -> System.out.println(name));
		List<String> passed = row5.stream().filter(name -> !(name.equals("Jess"))).map(name -> name + " is trash")
				.collect(Collectors.toList());
		passed.stream().forEach(name -> System.out.println(name));
	}

}
