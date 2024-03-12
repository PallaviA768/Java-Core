package com.learning.core.day3;

public class D03P12 {

		public static boolean strcheck(String s1, String s2) 
		{
			if (s1 != s2)
				return false;
			return true;
		}

		// Return if the given string can be split or not.
		public static boolean check(String s) 
		{
			if (s.length() >= 10)
				return true;

			// Brute Force
			for (int i = 1; i < s.length(); i++) 
			{
				for (int j = i + 1; j < s.length(); j++) 
				{
					for (int k = j + 1; k < s.length(); k++) 
					{
						
						// Making 4 string from the given string
						String s1 = "", s2 = "", s3 = "", s4 = "";
						try
						{
							s1 = s.substring(0, i);
							s2 = s.substring(i, j - i);
							s3 = s.substring(j, k - j);
							s4 = s.substring(k, s.length() - k);
						} 
						catch (StringIndexOutOfBoundsException e) {
						}

						// Checking if they are distinct or not.
						if (strcheck(s1, s2) && strcheck(s1, s3) && 
							strcheck(s1, s4) && strcheck(s2, s3) && 
							strcheck(s2, s4) && strcheck(s3, s4))
							return true;
					}
				}
			}

			return false;
		}

		// Driver code
		public static void main(String[] args)
		{
			String str = "aaabb";
			if (check(str))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}




