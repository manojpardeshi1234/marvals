package com.basic;

import java.util.Scanner;
public class Switch_case {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number between 1 to 5");
		int num= sc.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("one");
			break;
			
		case 2:
			System.out.println("two");
			break;
			
		case 3:
			System.out.println("three");
			break;
			
		case 4:
			System.out.println("Four");
			break;
			
		case 5:
			System.out.println(" Five");
			break;
			
		default:
			System.out.println("invalid number");
			break;
			
		}
		
	}
	

}
