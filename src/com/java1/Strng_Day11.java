package com.java1;

public class Strng_Day11 {
	public static void main(String[] args) {
		
		String s = "Happy New Year";
		String t = "Happy Pongal To All";
		
		int length = s.length();
		System.out.println(length);
		int length2 = t.length();
		System.out.println(length2);
		
		boolean equals = s.equals("Happy New Year");
		System.out.println(equals);
		boolean equals2 = t.equals("Happy Pongal to all");
		System.out.println(equals2);
		
		boolean eic = s.equalsIgnoreCase("happy new year");
		System.out.println(eic);
		boolean eic2 = t.equalsIgnoreCase("happy pongal to all");
		System.out.println(eic2);
		
		char charAt = s.charAt(6);
		System.out.println(charAt);
		char charAt2 = t.charAt(11);
		System.out.println(charAt2);
		
		int indxf = s.indexOf('w');
		System.out.println(indxf);
		int indxf2 = t.indexOf('T');
		System.out.println(indxf2);
		
		boolean contains = s.contains("New");
		System.out.println(contains);
		boolean contains2 = t.contains("To");
		System.out.println(contains2);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String upperCase2 = t.toUpperCase();
		System.out.println(upperCase2);
		
		String lc = s.toLowerCase();
		System.out.println(lc);
		String lc2 = t.toLowerCase();
		System.out.println(lc2);
		
		boolean sw = s.startsWith("Happy");
		System.out.println(sw);
		boolean sw2 = t.startsWith("happy");
		System.out.println(sw2);
		
		boolean ew = s.endsWith("ear");
		System.out.println(ew);
		boolean ew2 = t.endsWith("all");
		System.out.println(ew2);
		
		String replace = s.replace('w', 'e');
		System.out.println(replace);
		String replace2 = t.replace('p', 'v');
		System.out.println(replace2);
		
		String rplc = s.replace("New", "Old");
		System.out.println(rplc);
		String rplc2 = t.replace("All", "You");
		System.out.println(rplc2);
		
		String sst = s.substring(6);
		System.out.println(sst);
		String sst2 = t.substring(13);
		System.out.println(sst2);
		
		String sst3 = s.substring(6, 10);
		System.out.println(sst3);
		String sst4 = t.substring(13, 16);
		System.out.println(sst4);
		
		String concat = s.concat(t);
		System.out.println(concat);
		String concat2 = t.concat(" & "+ s);
		System.out.println(concat2);
		
		
		
		
		
	}

}
