package com.number;

import java.util.Scanner;

public class Main {

	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number (upto crore) :");
		int num = sc.nextInt();
		long startTime = System.currentTimeMillis();
		String words = Number.toWords(num);
		long totalTime = System.currentTimeMillis()-startTime;
		System.out.println(words);
		System.out.println("\nEnd : "+totalTime+" ms");
	}
}
