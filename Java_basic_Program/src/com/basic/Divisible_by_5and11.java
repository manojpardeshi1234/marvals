package com.basic;

import java.util.Scanner;
public class Divisible_by_5and11 {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		if((num % 5==0) && (num % 11==0))
			System.out.println("number is divisible by 5 and 11");
		
		else 
			System.out.println("number is not divisible by 11 and 5");
	}

}
