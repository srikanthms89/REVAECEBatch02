package com.tns.day2;

public class TypeCasting {

	public static void main(String[] args) {


		 //Implicit Type casting // widening
		float f = 45.8f;
		double d = f;
		System.out.println(d);
		
		
		char ch = 'A';
		int a = ch;
		System.out.println(a);
		
		//explicit Type casting //narrowing
		double f1 = 10.65d;
		float f2 = (float) f1;
		System.out.println(f2);
		
		char r = 'b';
		byte e = (byte)r;
		System.out.println(e);
		

	}

}
