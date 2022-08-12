package com.vfislk.training;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[4];
		System.out.println();
		System.out.println(nums.length);
		System.out.println(nums[0]);

		nums[0] = 90;
		nums[1] = 90;
		nums[2] = 90;
		nums[3] = 90;

		for (int i : nums) {
			System.out.println(i);
		}

	}

}
