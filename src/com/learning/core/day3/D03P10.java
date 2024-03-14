package com.learning.core.day3;

public class D03P10 {
	public static int largestPrefixSuffix(String str)
		{
			int n = str.length();
			if (n < 2) {
				return 0;
			}

			int len = 0;
		
			int i = 0;

			// Iterate through the first half of the string.
			while (i < n / 2) {
				int j1 = 0, j2 = (n - 1) - i;
				boolean isPrefixSuffix = true;

				
				while (j1 <= i) {

					
					if (str.charAt(j1) != str.charAt(j2)) {
						isPrefixSuffix = false;
					}
					j1++;
					j2++;
				}
				// If it's a prefix-suffix, update the length.
				if (isPrefixSuffix)
					len = i + 1;
				i++;
			}

			// Return the length of the longest prefix which is
			// also a suffix.
			return len;
		}

		// Driver code
		public static void main(String[] args)
		{
			String s = "aabcdaabc";

			// Function Call to find the length of the longest
			// prefix which is also a suffix
			System.out.println(largestPrefixSuffix(s));
		}
	}


