package com.learning.core.day4;

public class D04P03 {
	

	    private String name;
	    private String jobProfile;
	    private int age;

	    public String getName() {
	        return name;
	    }
	      
	    public void setName(String name) {
	        this.name = name;
	    }
	      
	    public String getJobProfile() {
	         return jobProfile;
	    }
	      
	    public void setJobProfile(String jobProfile) {
	        this.jobProfile = jobProfile;
	    }
	      
	    public int getAge() {
	        return age;
	    }
	      
	    public void setAge(int age) {
	        this.age = age;
	    }
	}


	class Validator{
	public class ValidateName{
	    public String boolean{
	        if(name != null){
	            return name;
	            
	        }else{
	            exception{
	                System.out.println("Invalid name");
	            }
	        }
	        
	            }
	        }
	public class ValidateJobProfile{
	    public String ValidateJobProfile boolean{
	        if(jobProfile = ("associate" || "clerk" || "executive" || "Officer"){
	            return jobProfile;
	        }
	        else{
	            exception{
	                System.out.println("Invalid job post");
	            }
	        }
	        
	            }
	        }
	       public class Age{
	           public int age boolean{
	               if(age(30>=age<=18){
	                   return age;
	               }else{
	                   exception{
	                       System.out.println("Invalid age");
	                   }
	               }
	           }
	       }
	class Tester {

	    public static void main(String[] args) {
	            
	        try {
	            Applicant applicant= new Applicant();
	            applicant.setName("Jenny");
	            applicant.setJobProfile("Clerk");
	            applicant.setAge(25);
	            
	            Validator validator = new Validator();
	                  
	            validator.validate(applicant);
	            System.out.println("Application submitted successfully!");
	        } 
	        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	}
	


