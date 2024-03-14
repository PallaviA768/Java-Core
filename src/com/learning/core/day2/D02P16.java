package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int n1=0,n2=1;
		for(int i=0; i<n; i++)
		{
			int n3=n1+n2;
			System.out.print(n1+" ");
			n1=n2;
			n2=n3;
		}
	}

}
