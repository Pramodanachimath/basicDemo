package com.vfislk.training;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p=1;
		for(int i=1;i<11;i++)
		{
			p=n*i;
			System.out.println(  n +" * " + i +" = "+p);
		}
		sc.close();
	}

}
