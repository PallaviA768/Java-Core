package com.learning.core.day6;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class D06P02 {
    public static void main(String[] args) {
       
        LinkedHashMap<String, String> phone = new LinkedHashMap<>();

      
        phone.put("Amal", "998787823");
        phone.put("Manvitha", "937843978");
        phone.put("Joseph", "7882221113");
        phone.put("Smith", "8293893311");
        phone.put("Kathe", "7234560011");
        Scanner scanner= new Scanner(System.in);
        
        String nameToSearch = scanner.nextLine();
        String phoneNumber = phone.get(nameToSearch);
      
        if (phoneNumber != null) {
            System.out.println (phoneNumber);
        } else {
            System.out.println("No entry found for " + nameToSearch);
        }
        }
    }

