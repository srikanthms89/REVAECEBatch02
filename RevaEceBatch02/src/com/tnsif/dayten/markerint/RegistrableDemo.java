package com.tnsif.dayten.markerint;

public class RegistrableDemo {

	public static void main(String[] args) {

		Student st = new Student(101,"kumar",5500,"java");
		
		/*
		 * if(st instanceof Registrable) { System.out.println("Student is Registered");
		 * } else { System.out.println("Student is not registered"); }
		 */
		
		System.out.println(st);
	}

}
