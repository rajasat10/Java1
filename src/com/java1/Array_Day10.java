package com.java1;

import java.util.Iterator;

public class Array_Day10 {
	public static void main(String[] args) {
		
	String b[] = new String [6];
	b[0] = "Shiva";
	b[1] = "Vijay";
	b[2] = "Raja";
	b[3] = "Karthi";
	b[4] = "sekar";
	b[5] = "Jai chandran";
	System.out.println("Names are : ");
	for (int n = 0; n < b.length; n++) {
		System.out.println(b[n]);
		
	}
	
	System.out.println();
	
	  int a[] = new int[6];
	  
	  a[0] = 29;
	  a[1] = 28;
	  a[2] = 27;
	  a[3] = 30;
	  a[4] = 31;
	  a[5] = 95;
	  System.out.println("Their ages are : ");
	  for (int i = 0; i < a.length; i++) {
		  System.out.println(a[i]);
		
	} 
	  System.out.println();
	  
	  float c[] = new float [2];
	  c[0] = (float) 74.5;
	  c[1] = (float) 88.6;
	   System.out.println("Percentages are : ");
	   System.out.println(c[0]);
	   System.out.println(c[1]);
	   
	   System.out.println();
	   
	   double d[] = new double [2];
	   d[0] = 98794.45785;
	   d[1] = 97755.45488;
	   System.out.println("Their Contact numbers are : ");
	   System.out.println(d[0]);
	   System.out.println(d[1]);
	   
	  
	  
	  
	}

}
