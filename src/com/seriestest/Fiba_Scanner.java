package com.seriestest;

import java.util.Scanner;

public class Fiba_Scanner {
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner s=new Scanner (System.in);
		int a=0,b=1,c;
		int d = s.nextInt();
		for (int i = 0; i < d; i++) {
			if(d<=0) {
				a=d;
				c=0;
				
			}
			else {
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
			s.close();
		}
	}
}

