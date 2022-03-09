package com.java1;

import java.util.Scanner;

public class Scan_Day7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String fullname = sc.nextLine();
		System.out.println("My full name is : "+fullname);
	
		System.out.println("Enter number");
		long num = sc.nextLong();
		System.out.println("My number is : "+num);
		
		System.out.println("Enetr your grade");
		float grade = sc.nextFloat();
		System.out.println("My grade is : "+grade);
		
		System.out.println("Enter Imei number");
		double imei = sc.nextDouble();
		System.out.println("My Imei num is : "+imei);
		
		System.out.println("Enter true or false");
		boolean nat = sc.nextBoolean();
		System.out.println("Indian ? : "+nat);
		
		System.out.println("Enter your pincode");
		int pin = sc.nextInt();
		System.out.println("My pincode is : "+pin);
		
		System.out.println("Enter your city");
		String city = sc.next();
		System.out.println("My city is : "+city);
			 
	}

}
