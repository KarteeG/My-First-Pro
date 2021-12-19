package com.seriestest001;

import java.util.Scanner;

public class Fibanacci {
	
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Entry The Number");
		
		int a=0,b=1,c;
		int d = s.nextInt();
		
		for (int i = 0; i < d; i++) {
			if(d<0) {
				a=i;
				c=0;
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

