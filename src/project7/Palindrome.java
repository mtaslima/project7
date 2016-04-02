package project7;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String stl = "madam";
		String reverse = "";
		
       
		for (int i = stl.length()- 1; i >= 0; i--) {
            reverse = reverse + stl.charAt(i);
			

        if (stl.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");

		}
        	
	}
        		
}
