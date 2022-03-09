package com.java1;

public class Abst_ImplDay3 extends Abst_Day3 {

	@Override
	public void father() {
		System.out.println("My father is Murugan");
		
	}

	@Override
	public void mother() {
		System.out.println("My mother is Sumathi");
		
	}

	@Override
	public void brother() {
		System.out.println("My brother is Jayachandran");
		
	}

	@Override
	public void sister() {
		System.out.println("My sister is Deepthi");
		
	}

	@Override
	public void cousin() {
		System.out.println("My cousin is Subash");
		
	}
	public static void main(String[] args) {
		
		Abst_ImplDay3 ob = new Abst_ImplDay3();
		ob.father();
		ob.mother();
		ob.brother();
		ob.sister();
		ob.cousin();
		
	}

}
