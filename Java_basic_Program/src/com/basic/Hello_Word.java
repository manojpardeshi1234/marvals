package com.basic;

import java.util.Scanner;
public class Hello_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a=2;
			int b=2;
			
			int x= ++a + ++b;
			System.out.println(x+" "+a+" "+b);
			
			x=a++ +b++;
			System.out.println(x+" "+a+" "+b);
		
	}

}
