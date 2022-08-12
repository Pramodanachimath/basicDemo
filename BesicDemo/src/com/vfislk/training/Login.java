package com.vfislk.training;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to login");
		String s = sc.next();
		int i = 0;
		String[] username = { "Tom", "Ram", "Jack", "Cook", "Jack" };
		boolean isname = false;
		for (String name : username) {
			if (name.equalsIgnoreCase(s)) {
				// System.out.println("Welcome "+name);
				isname = true;
				i++;
			}
		}
		if (isname) {
			System.out.println("Welcome " + s);
			System.out.println("name is repeated for " + i + " times");
		} else {
			System.out.println("Sorry wrong username");
		}
		sc.close();
	}

}
