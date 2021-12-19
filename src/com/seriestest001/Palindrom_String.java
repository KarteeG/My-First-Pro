package com.seriestest001;

import java.util.Scanner;

public class Palindrom_String {
	public static void main(String[] args) {
		System.out.println("Enter The String");
		Scanner s=new Scanner (System.in);
		
		String a,b="";
		a = s.nextLine();
		int n = a.length();
		for (int i = n-1; i >=0; i--) {
			b=b+a.charAt(i);
		}
			if (a.equalsIgnoreCase(b)) {
				System.out.println("Palindrome");
				
				
			}
			else {
				System.out.println("Non Palindrome");
			}
			
		}
		
		
	}

