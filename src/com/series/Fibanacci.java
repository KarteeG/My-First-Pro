package com.series;

public class Fibanacci {
	
	public static void main(String[] args) {
		int a=0,b=1,c;
		for (int i = 0; i < 5; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}

}
