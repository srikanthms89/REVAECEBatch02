//Program to demonstrate creating thread using extending class
package com.tnsif.dayfifteen;

public class Mulithreading extends Thread {
	
	@SuppressWarnings("deprecation")
	public void run()
	{
		try {
			System.out.println("thread" +Thread.currentThread()+"is running");
		}
		catch(Exception e)
		{
			System.err.println("Exception caught" +e.getMessage());
		}

}
}
