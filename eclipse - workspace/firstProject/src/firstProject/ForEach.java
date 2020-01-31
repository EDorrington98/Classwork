package firstProject;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 8;
		nums[1] = 2;
		nums[2] = 15;

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		for (int num : nums) {
			System.out.println(num);
		}

		ArrayList<Integer> val = new ArrayList<Integer>();
		val.add(8);
		val.add(2);
		val.add(15);

		for (int i = 0; i < val.size(); i++) {
			System.out.println(val.get(i));
		}
		for (Integer vals : val) {
			System.out.println(vals);
		}

	}
}
