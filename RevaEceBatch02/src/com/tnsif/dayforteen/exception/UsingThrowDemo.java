package com.tnsif.dayforteen.exception;

import java.util.Scanner;

public class UsingThrowDemo {

	public static void main(String[] args) {
		StudentInfo obj=new StudentInfo();
		obj.setRollNo(10);
		obj.setName("Pooja");
		obj.setPer(105);
		obj.show();
		
		System.out.println("Enter Name and Age");
		Scanner sc=new Scanner(System.in);
		VoterInfo obj1=new VoterInfo();
		obj1.setName(sc.next());
		obj1.setAge(sc.nextInt());
		if (obj1.getAge()!=0)
			System.out.println(obj1);
	}
}
