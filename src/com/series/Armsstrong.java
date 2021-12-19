package com.series;

public class Armsstrong {
	public static void main(String[] args) {
		
	int a=153,b,c=0;
	while(a>0) {
		b=a%10;
		c=c+(b*b*b);
		a=a/10;
		
	}
	System.out.println(c);

}}
