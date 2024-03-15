package com.learning.core.day5;
import java.util.TreeSet;

public class D05P06 
{
	public static void main(String[] args) 
	{
		Person p1= new Person(1,"Aby",22,2000);
		Person p2= new Person(2,"Binoy",21,1500);
		Person p3= new Person(3,"Cyril",19,2500);
		Person p4= new Person(4,"Dan",24,1090);
		Person p5= new Person(5,"John",32,1999);
		Person p6= new Person(6,"Tom",42,3999);
		
		TreeSet<Person> tp= new TreeSet<>();
		tp.add(p1);
		tp.add(p2);
		tp.add(p3);
		tp.add(p4);
		tp.add(p5);
		tp.add(p6);
		
		for(Person p : tp)
		{
			if(p.getAge()>25)
			{
				System.out.println(p);
			}
		}
		
	}
}
