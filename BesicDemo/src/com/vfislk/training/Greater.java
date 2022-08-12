package com.vfislk.training;

public class Greater {

	 public static void main(String[] args) {
		int x=10,y=20,z=30;
		
		
		int res = (x>y && x>z) ? x : (y>z) ? y:z;
		
		System.out.println("max is "+res);
		
		
		/*if(x>y && x>z)
		{
			System.out.println(x);
		}
		else if(y>z)
		{
			System.out.println(y);
		}
		else 		{
			System.out.println(z);
		}*/
			
			
		
	}
}
