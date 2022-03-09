package com.java1;

public class Constr_ClsDay4 {
	public Constr_ClsDay4() {
		System.out.println("My name is Raja");
	}	
	public Constr_ClsDay4(String name) {
		System.out.println("Father name is: "+name);
	}
	public Constr_ClsDay4(int dno) {
		System.out.println("Door no is: "+dno);
	}
	public Constr_ClsDay4(long pincode) {
		System.out.println("Pincode is: "+pincode);
	}
	public static void main(String[] args) {
		
		Constr_ClsDay4 ob = new Constr_ClsDay4();
		Constr_ClsDay4 ob1 = new Constr_ClsDay4("Murugan");
		Constr_ClsDay4 ob2 = new Constr_ClsDay4(256);
		Constr_ClsDay4 ob3 = new Constr_ClsDay4(638401l);
		
	}

}
