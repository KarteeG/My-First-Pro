package com.series;

import java.util.Scanner;

public class Arms_Scanner_500 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter");
		int d = s.nextInt();
		int i=1,a,arm,n,temp;
		System.out.println("Am");
		while(i<d) {
			n=i;
			arm=0;
			while(n>0) {
				a=n%10;
				arm=arm+(a*a*a);
				n=n/10;
				
				
			}
			if(arm==i)
				System.out.println(i);
			
			i++;
		}
		
		
			
	}

}
