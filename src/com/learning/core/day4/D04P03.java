package com.learning.core.day4;
class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

// Validator.java
class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.applicantName)) {
            throw new CatheyBankException("Invalid Applicant Name");
        }
        if (!isValidPost(applicant.postApplied)) {
            throw new CatheyBankException("Invalid Post");
        }
        if (!isValidAge(applicant.applicantAge)) {
            throw new CatheyBankException("Invalid Age");
        }
        System.out.println("All details are valid.");
    }

    public boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

    public boolean isValidPost(String post) {
        return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

    public boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

// Applicant.java
class Applicant {
    String applicantName;
    String postApplied;
    int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }
}

// Tester.java
public class D04P03 {
    public static void main(String[] args) {
        Validator validator = new Validator();

        // Test cases
        Applicant[] applicants = {
            new Applicant("Mary", "Assistant", 34),
            new Applicant("Mary", "Clerk", 27),
            new Applicant("Probationary Officer", "30", 0),
            new Applicant("Joseph", "Probationary Officer", 30)
        };

        for (Applicant applicant : applicants) {
            try {
                validator.validate(applicant);
            } catch (CatheyBankException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
	


