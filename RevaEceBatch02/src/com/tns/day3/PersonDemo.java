package com.tns.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		
		 Person  obj = new  Person ();
	 String name,gender;
		 int income,age;
		
			//scanner object to accept user inputs
			Scanner ob = new Scanner(System.in);
			
		
			System.out.println("Enter Person Name : ");
			name = ob.next();
			System.out.println("Enter age: ");
		 age = ob.nextInt();
			System.out.println("Enter gender: ");
		 gender = ob.next();
			System.out.println("Enter taxable income: ");
			 income = ob.nextInt();
			 
			 obj.setName(name);
			 obj.setAge(age);
			 obj.setGender(gender);
			 obj.setIncome(income);
			
		
		 
		 
		// System.out.println(obj);
		 
		 TaxCalculation  tax = new TaxCalculation ();
		 
		 tax.calculateTax(obj );
		 
		 System.out.println(obj);
		 
		 
		
		 
	}

}
