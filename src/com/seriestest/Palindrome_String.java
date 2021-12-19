package com.seriestest;

import java.util.Scanner;

public class Palindrome_String {
	
	public static void main(String[] args) {
		System.out.println("Enter The String");
		String a,b="";
		Scanner s=new Scanner(System.in);
		
		 a = s.nextLine();
		 int n = a.length();
		 
		 for (int i = n-1; i >=0; i--) {
			 b=b+a.charAt(i);
		 }
			if (a.equalsIgnoreCase(b)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Non");
			}
			 
			 
			
		}
		
		}
		
		
	

