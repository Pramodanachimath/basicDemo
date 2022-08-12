package com.vfislk.training;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int[] nums = new int[4];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		int sum = 0;

		for (int val : nums) {

			sum += val;
			System.out.println(val);

		}
		System.out.println(sum);
		sc.close();
	}

}
