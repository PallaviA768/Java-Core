package com.learning.core.day3;
import java.io.*;
public class D03P06 {
			public static void main(String[] args)
			throws IOException
		{
			String str = "Testing";
			str = str.toLowerCase();
			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'i'
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
					
					count++;
				}
			}

			
			System.out.println(
				"Total no of vowels in string are: " + count);
		}
	}
