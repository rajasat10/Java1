package com.java1;

public class Constr_Day4 extends Constr_ClsDay4{
	public void car() {
		System.out.println("Honda city");
	}
	public void bike() {
		System.out.println("Kawasaki ninja");
	}
	public static void main(String[] args) {
		Constr_Day4 ob = new Constr_Day4();
		Constr_ClsDay4 ob1 = new Constr_ClsDay4("Murugan");
		Constr_ClsDay4 ob2 = new Constr_ClsDay4(256);
		ob.car();
		ob.bike();
			
	}

}
