package com.finserv.assignmentDay4;

public class Rectangle extends Shape{
	
	int l;
	int b;
	
	
	Rectangle(int l,int b){
		
		super("Rectangle");
		
		this.l=l;
		this.b=b;
	}
	
	public double calculateArea() {
		
		return l*b;
	}

}
