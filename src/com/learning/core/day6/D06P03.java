
package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Manual implements Comparable<Book>
{
	private int Id;
	private String title;
	private double price;
	private Date dOp;
	private String author;
	
	public Manual() {
		super();
	}

	public Manual(int Id, String title, double price, Date dOp, String author) {
		super();
		this.Id = Id;
		this.title = title;
		this.price = price;
		this.dOp = dOp;
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, Id, dOp, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Id == other.Id && Objects.equals(dOp, other.dOp)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return Id + " " + title + " " + price + " "+ author+"   " 
				+ dOp.getDate()+"/"+dOp.getMonth()+"/"+dOp.getYear();
	}
	
	@Override
	public int compareTo(Book o) 
	{
		return this.Id - o.Id;
	}
}
@SuppressWarnings("deprecation")
public class D06P03 
{
	public static void main(String[] args) 
	{
		TreeSet<Book> b= new TreeSet<>();
		
		b.add(new Manual(1001,"Python Learning",715,new Date(2020,2,2),"Martic C. Brown"));
		b.add(new Manual(1002,"Modern Mainframe",295,new Date(1997,5,19),"Sharad"));
		b.add(new Manual(1003,"java Programming",523,new Date(1984,11,23),"Gilad Bracha"));
		b.add(new Manual(1004,"Read C++",295,new Date(1984,11,19),"Henry Harvin"));
		b.add(new Manual(1005,".Net Platform",3497,new Date(1984,3,6),"Mark J. Price"));
		

		for (Book bk : b) 
		{
            System.out.println(bk);
        }
	}

}
