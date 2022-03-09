package com.java1;

public class Inter_ImplDay3 implements Inter_Day3{

	@Override
	public void educationLoan() {
		System.out.println("Interest for Education loan is 9%");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("Interest for Home loan is 7%");
		
	}

	@Override
	public void carLoan() {
		System.out.println("Interest for Car loan is 11%");
		
	}

	@Override
	public void personalLoan() {
		System.out.println("Interest for Personal loan is 12%");
		
	}

	@Override
	public void mortageLoan() {
		System.out.println("Interest for Mortage loan is 14%");
		
	}

	@Override
	public void businessLoan() {
		System.out.println("Interest for Business loan is 10%");
		
	}
	public static void main(String[] args) {
		
		Inter_ImplDay3 ob = new Inter_ImplDay3();
		
		ob.educationLoan();
		ob.homeLoan();
		ob.personalLoan();
		ob.mortageLoan();
		ob.businessLoan();
		ob.carLoan();
		
	}

}
