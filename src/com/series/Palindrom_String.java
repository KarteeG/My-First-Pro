package com.series;

import java.util.Scanner;

public class Palindrom_String {
	public static void main(String[] args) {
		
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		 a = sc.nextLine();
		 int n = a.length();
		 for (int i = n-1; i >=0; i--) {
			 b=b+a.charAt(i);
		 }
		 if(a.equalsIgnoreCase(b)) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Non Palindrome");
		 }
		}		 
		
	
		
		
		
	}


