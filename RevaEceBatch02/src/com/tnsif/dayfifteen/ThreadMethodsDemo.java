package com.tnsif.dayfifteen;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(3, "REVA"); // creating child thread object
		ChildThread t2 = new ChildThread(3, "ECE"); // creating child thread object
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread

		t1.start();
		t2.start();
		//Thread.currentThread().setName("REVA ECE"); // assign name to thread
		//Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing priority of the thread
		//System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
		try {
			t1.join(); // wait current thread until t1 is dead
			t2.join(300); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Restore interrupted status
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	}
}