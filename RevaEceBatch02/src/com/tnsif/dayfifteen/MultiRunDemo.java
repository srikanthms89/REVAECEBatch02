package com.tnsif.dayfifteen;

public class MultiRunDemo {

	public static void main(String[] args) {

      int n=10;
      for (int i=0 ; i< 10; i++)
      {
    	 // MultiRun obj = new MultiRun();
    	  Thread objj = new Thread(new MultiRun());
    	  objj.start();
      }

	}

}
