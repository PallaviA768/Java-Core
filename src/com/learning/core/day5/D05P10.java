package com.learning.core.day5;
import java.util.TreeSet;

public class D05P10 
{
	public static void main(String[] args) 
	{
		Person p1= new Person(1,"Jerry",22,999);
		Person p2= new Person(2,"Smith",21,2999);
		Person p3= new Person(3,"Popeye",19,5999);
		Person p4= new Person(4,"Jones",24,6999);
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
			if(p.getName().startsWith("J"))
			{
				System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getSalary());
				break;
			}
		}

	}
}
