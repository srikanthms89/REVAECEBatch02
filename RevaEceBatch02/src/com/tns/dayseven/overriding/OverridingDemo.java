//program to demonstrate method override /run time / dynamic binding
package com.tns.dayseven.overriding;

public class OverridingDemo {

	public static void main(String[] args) {


		   RBI rbi;
		   rbi = new SBI();
		   System.out.println(rbi.getRateofinterest());
		   
		   rbi = new HDFC();
		   System.out.println(rbi.getRateofinterest());
		   
		   rbi = new ICICI();
		   System.out.println(rbi.getRateofinterest());

	}

}
