package com.tnsif.dayfifteen;

public class RunnableDemo {
	public static void main(String[] args) {
		UsingRunnable ur = new UsingRunnable(10, 20, "Hello");

		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		
		// lambda expression
		
		 runnable = () -> { System.out.println("Runnable with Lambda Expression"); };
		 
		  new Thread(runnable).start();
		  
		  System.out.println("-------------------------------------------------------");
   int n=5; 
   runnable = () -> { 
	   try { 
		    for (int i = 1; i <= n; i++) {
		  System.out.println("Loop iteration: " + i); Thread.sleep(1000); } } catch
		 (InterruptedException e) { System.err.println("Task interrupted."); } };
		 

		// Execute the runnable
		new Thread(runnable).start();

	}
}