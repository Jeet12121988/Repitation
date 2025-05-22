package may21;

import java.util.Scanner;
import java.util.regex.*;

public class May1a {
	
	
	public static void isString() {
		
		
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("Enter your String");
		  String email=sc.findInLine("[a-zA-Z]");
		  
		  if (email != null) {
			  System.out.println(email);
			} else {
			 throw new ArithmeticException("Please Enter Number");
			}

		  String a=sc.nextLine();
		 System.out.println(a);
		 
		 
		//String a="Hello Jeet";
		 
		/*
		 * Pattern pattern=Pattern.compile("[^abc]"); Matcher matcher =
		 * pattern.matcher(a); boolean matchFound = matcher.find(); if(matchFound) {
		 * System.out.println("Match found"); throw new
		 * ArithmeticException("Please enter String"); } else {
		 * System.out.println("Match not found"); }
		 */

		String reverse="";
		
		
		String[] b=a.split(" ");
		
		for(int i=0;i<b.length;i++) {
			String k="";
			
			for(int j=0;j<b[i].length();j++) {
				
				 k=b[i].charAt(j)+k;
			}
			
			reverse=reverse+k;
		}
		
		System.out.println(reverse);
		
		
			
	}

	public static void main(String[] args) {
		
		isString();
	}

}
