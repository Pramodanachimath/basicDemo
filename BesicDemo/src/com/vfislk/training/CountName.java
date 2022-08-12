package com.vfislk.training;

import java.util.Scanner;

public class CountName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");

		String s = sc.next();
		int i = 0;
		String[] username = { "Tom", "Ram", "Sham", "Jack", "Ram", "Pam", "Ram", "Tom" };
		boolean isname = false;
		for (String name : username) {
			if (name.equalsIgnoreCase(s)) {
				isname = true;
				i++;
			}
		}
		if (isname) {
			System.out.println("Welcome " + s);
			System.out.println();
			System.out.println("name is repeated for " + i + " times");
		} else {
			System.out.println("Sorry Wrong username");
		}
		sc.close();
	}

}
