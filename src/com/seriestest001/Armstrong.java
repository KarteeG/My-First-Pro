package com.seriestest001;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner s= new Scanner (System.in);
		int a,b,c,d;
		d = s.nextInt();
		a=d;
		c=0;
		while(a>0) {
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
		}
		System.out.println(c);
		if(c==d) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Non Armstrong");
		}
	}

}
