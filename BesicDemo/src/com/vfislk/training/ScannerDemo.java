package com.vfislk.training;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.nextLine();
		System.out.println("Welcome "+name);
		System.out.println();
		
		System.out.println("Enter sal");
		double sal=sc.nextDouble();
		System.out.println("sal= "+sal);
		System.out.println();

		System.out.println("Enter city");
		sc.nextLine();
		String city=sc.next();
		System.out.println("city= "+city);
		System.out.println();
		
		System.out.println("Enter state");
		String state=sc.next();
		System.out.println("state= "+state);
		
		sc.close();
		
	}

}
