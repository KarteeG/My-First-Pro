package com.seriestest001;

import java.util.Scanner;

public class Arms500 {
	
	public static void main(String[] args) {
		System.out.println("Enter Series");
		Scanner s= new Scanner(System.in);
		int i=1,a,b,c;
		int d = s.nextInt();
		while(i<=d) {
			a=i;
			c=0;
			while(a>0) {
				b=a%10;
				c=c+(b*b*b);
				a=a/10;
			}
			if(c==i)
			System.out.println(i);
			i++;
		}
		
	}
}