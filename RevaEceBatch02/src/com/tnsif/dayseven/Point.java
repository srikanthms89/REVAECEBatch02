//program to demonstrate constructor overloading
package com.tnsif.dayseven;

public class Point {
	
	private float x;
	private float y;
	
	public Point() {
		x=0.0f;
		y=0.00f;


	}
public Point(float x) {
		
		this.x = x;
		
	}
	

	public Point(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}
