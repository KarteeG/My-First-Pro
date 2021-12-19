package com.series;

import java.util.Scanner;

public class Palindrom_Scanner {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int a,b,c=0,d=0;
		b = s.nextInt();
		a=b;
		while(b>0) {
				b=a%10;
				c=(c*10)+b;
				a=b/10;
			}
		System.out.println(c);

		if(d==c) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Non");
		}
		
		}
		
		
			
			}
			
			
		
	
