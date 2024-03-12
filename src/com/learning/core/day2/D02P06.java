package Main;

import java.util.Scanner;
class WeekDay
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = input.nextInt();			
		if(num==1)
			System.out.println("This is a Monday");
		else if(num==2)
			System.out.println("This is a Tuesday");
		else if(num==3)
			System.out.println("This is a Wednesday");
		else if(num==4)
			System.out.println("This is a Thursday");
		else if(num==5)
			System.out.println("This is a Friday");
		else if(num==6)
			System.out.println("This is a Saturday");
		else if(num==7)
			System.out.println("This is a Sunday");
		else
			System.out.println("Not Exisist");
	}
}
