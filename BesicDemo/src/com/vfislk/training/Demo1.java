package com.vfislk.training;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a = sc.nextInt();

		System.out.println("Enter 2nd no");
		int b = sc.nextInt();

		System.out.println("Enter 3rd no");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("max no is : " + a);
		} else if (b > c) {
			System.out.println("max no is : " + b);
		} else
			System.out.println("max no is : " + c);

	}

}
