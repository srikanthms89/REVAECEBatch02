package com.tnsif.daynine;

public class Rectangle extends Shape{
	
	private float width,height;

	public Rectangle() {
		width =2.8f;
		height = 4.5f;
	}

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	void calArea()
	{
		area = width * height;
	}
	
	
	
	
	

}
