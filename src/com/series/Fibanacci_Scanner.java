package com.series;

import java.util.Scanner;

public class Fibanacci_Scanner {
	
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner s=new Scanner (System.in);
		int a=0,b=1,c,d;
		d = s.nextInt();
		for (int i = 0; i < d; i++) {
			if(d<=0) {
				c=d;
				
			}
			else {
				c=a+b;
				a=b;
				b=c;
				
			}
			System.out.println(c);
		}
	}

}
