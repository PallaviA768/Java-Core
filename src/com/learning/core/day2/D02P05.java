package com.learning.core.day2;

import java.util.Scanner;

public class D02P05 {
	
		public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		n=sc.nextInt();
		if(n%5!=0) {
		
		System.out.println("The number is not divisible by 5");//prints largest number
		}
		else
		{
			System.out.println("The number is divisible by 5");
		}
		}
}


