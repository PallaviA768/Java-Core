package com.learning.core.day2;
import java.util.Scanner;
public class D02P04 {
	public static void main(String[] args) {
	int a,b,c,largest,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=sc.nextInt();
	System.out.println("Enter the second number: ");
	b=sc.nextInt();
	System.out.println("Enter the third number: ");
	c=sc.nextInt();
	temp=a>b?a:b;//comparing a value with b and storing largest value in temp
	largest=c>temp?c:temp;//Comparing the temp variable with c and storing largest value in largest
	System.out.println("The largest number is: "+largest);//prints largest number
	}

}
