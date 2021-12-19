package com.condition;

import java.util.Scanner;

public class Switch_Cases {
	public static void main(String[] args) {
		System.out.println("Enter The Day ;  ");
		Scanner s=new Scanner(System.in);
		String i = s.nextLine();
		switch(i) {
		case "mon":
			System.out.println("First Day");
			break;
		case "tue":
			System.out.println("Third Day");
			break;
		case "wed":
			System.out.println("Forth Day");
			break;
		case "thu":
			System.out.println("Fifth Day");
			break;
		case "fri":
			System.out.println("Sixth Day");
			break;
		case"sat":
			System.out.println("Seventh Day");
			break;
		case "sun":
			System.out.println("First Day");
			break;
		
		default:
		System.out.println("Non of these");
	}
	}
}
