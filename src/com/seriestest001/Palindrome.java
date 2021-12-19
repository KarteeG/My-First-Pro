package com.seriestest001;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner  s= new Scanner (System.in);
		System.out.println("Enter The Number");
		
		int a,b,c;
		int n = s.nextInt();
		a=n;
		c=0;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
			
		}
		System.out.println(c);
		if(c==n) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Non Palindrome");
		}
		
		
		
	}
	}

