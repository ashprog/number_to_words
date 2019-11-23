package com.number;

import java.util.Scanner;

public class Main {

	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number (upto crores) :");
		long startTime = System.currentTimeMillis();
		String s = Number.toWords(sc.nextInt());
		long totalTime = System.currentTimeMillis()-startTime;
		System.out.println(s);
		System.out.println("\nEnd : "+totalTime+" ms");
	}
}
