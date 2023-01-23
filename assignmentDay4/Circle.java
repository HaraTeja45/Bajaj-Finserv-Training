package com.finserv.assignmentDay4;

public class Circle  extends Shape{

	
	int radius;
	
	
	
	public Circle(int radius){
		
		super("circle");
		this.radius=radius;
	}
	
	
	public double calculateArea() {
		
		return 3.14*radius*radius;
	}
}
