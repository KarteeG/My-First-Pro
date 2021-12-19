package com.series;

import java.util.Scanner;

public class Arms_Scanner {
	public static void main(String[] args) {
	int arm=0,a,b,c,d,no;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	 no = s.nextInt();
	 d=no;
	 while(no>0)
	 {
		 a=no%10;
		 no=no/10;
		 arm=arm+a*a*a;
		 
	 }
	 if(arm==d) {
		 System.out.println("Armstrong");
	 }
	 else {
		 System.out.println("Non");
	 }
}}

