package com.java1;

public class Overriding_Day2 extends Java_Day1{
	@Override
public void studentDetails(String name, char initial) {
	System.out.println("My name is - "+name+" "+'M');
		super.studentDetails(name, initial);
}
@Override
public void studentDetails(int age,String dob) {
	System.out.println("My age & dob is - "+age+"&"+dob);
	super.studentDetails(age,dob);
}
@Override
public void studentDetails(String location, int pincode) {
	System.out.println("My location & pincode is - "+location+"&"+pincode);
	super.studentDetails(location, pincode);
}
@Override
public void studentDetails(long contactnumber) {
	System.out.println("My contact number is - "+contactnumber);
	super.studentDetails(contactnumber);
}
public static void main(String[] args) {
	Overriding_Day2 ob = new Overriding_Day2();
	ob.studentDetails("Raja", 'M');
	ob.studentDetails(29, "10/06/1992");
	ob.studentDetails("Sathy", 638401);
	ob.studentDetails(9994558840l);
	}
}
