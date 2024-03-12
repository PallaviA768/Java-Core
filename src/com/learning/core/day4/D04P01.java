package com.learning.core.day4;

public class D04P01 {
	    int account_number;
	    String name;
	    String account_type;
	    double balance;
	   
	    public int getAccount_number() {
	        return account_number;
	    }
	   
	    public void setAccount_number(int account_number) {
	        this.account_number = account_number;
	    }
	   
	    public String getName() {
	        return name;
	    }
	   
	    public void setName(String name) {
	        this.name = name;
	    }
	   
	    public String getAccount_type() {
	        return account_type;
	    }
	   
	    public void setAccount_type(String account_type) {
	        this.account_type = account_type;
	    }
	   
	    public double getBalance() {
	       
	        if( balance <1000)
	        {
	        try
	        {   
	            throw new NumberFormatException();
	        }
	        catch(NumberFormatException nw)
	        {
	            System.out.println("Low Balance"+balance);
	        }
	        }
	       
	       
	        return balance;
	       
	    }
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }//end setter and getter

	    public D04P01() {
	       
	        this.account_number = 100;
	        this.name = "AMOl";
	        this.account_type = "Saving";
	        this.balance = 500;
	    }
	   
	   
	   
	   
	    public D04P01(int account_number, String name, String account_type,
	            double balance) {
	       
	        this.account_number = account_number;
	        this.name = name;
	        this.account_type = account_type;
	        this.balance = balance;
	    }
	    void deposit(double amt)
	    {
	        if(amt<0)
	        {
	            try
	            {
	                throw new NumberFormatException();
	            }
	            catch(NumberFormatException nf)
	            {
	                System.out.println("Negaive Amount cant be deposited");
	            }
	        }
	        else
	        {
	            balance=getBalance()+amt;
	            System.out.println("Current balance is ="+balance);
	           
	        }
	       
	       }
	     
	     void display()
	     {
	    System.out.println("Balance is ="+getBalance());   
	     }
	   
	   
	   
	   
	    public static void main(String[] args) {
	       
	       
	    	D04P01 b=new D04P01();
	        b.deposit(2000);
	        b.display();
	        b.display();
	        b.getBalance();
	        b.display();
	       
	       }
	   
	   }

