package com.tnsif.daynine;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		//method overriding / dynamic binding
		
		Shape shape ;
		shape = new Rectangle();
		shape.calArea();
		shape.show();
		
		shape = new Square();
		shape.calArea();
		shape.show();
		
		Square sq = new Square();
		sq.calArea();
		sq.show();
		
		Rectangle re = new Rectangle ();
		re.calArea();
		re.show();

	}

}
