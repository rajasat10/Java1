package com.java1;

public class Java_Day1 {
	
 public void studentDetails(String name,char initial) {
	 System.out.println("Student name is - "+name+" "+initial);
	}
 
 public void studentDetails(int age,String dob) {
	 System.out.println("student age & dob is - "+age+"&"+dob);
}
 
 public void studentDetails(String location,int pincode) {
	 System.out.println("Student location & pincode is - "+location+"-"+pincode);	
}

public void studentDetails(long contactnumber) {
	System.out.println("Contact number is - "+contactnumber);
}

public static void main(String[] args) {
	Java_Day1 ob = new Java_Day1();
	
	ob.studentDetails("Raja",'M');
	ob.studentDetails(29,"10/06/1992");
	ob.studentDetails("Sathy", 638401);
	ob.studentDetails(9994558840l);
	}

}

