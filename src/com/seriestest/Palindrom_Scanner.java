package com.seriestest;

import java.util.Scanner;

public class Palindrom_Scanner {
	
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner s=new Scanner(System.in);
		int a,b,c=0,d=0;
		d = s.nextInt();
		a=d;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		System.out.println(c);
			if(c==d) {
				System.out.println("Armstrong");
			}
			else {
				System.out.println("Non");
			}
		}
	}


