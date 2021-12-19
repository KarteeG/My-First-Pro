package com.scanner;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter The name:");
		String nextLine = s.nextLine();
		System.out.println(nextLine);

		System.out.println("Enter the Byte:");
		byte nextByte = s.nextByte();
		System.out.println(nextByte);

		System.out.println("Enter The Int:");
		int nextInt = s.nextInt();
		System.out.println(nextInt);

		System.out.println("Enter The Short:");
		short nextShort = s.nextShort();
		System.out.println(nextShort);

		System.out.println("Enter The Float;");
		Float nextFloat = s.nextFloat();
		System.out.println(nextFloat);

		System.out.println("Enter The long:");
		long nextLong = s.nextLong();
		System.out.println(nextLong);

		System.out.println("Enter the Double:");
		double nextDouble = s.nextDouble();
		System.out.println(nextDouble);

		System.out.println("Enter The Char:");
		char charAt = s.next().charAt(2);
		System.out.println(charAt);

	}

}
