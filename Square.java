package com.finserv.assignmentDay4;

public class Square  extends Shape{
	
	int n;
	
	
	
	Square(int n){
		super("Square");
		this.n=n;
		
	}
	

	public double calculateArea() {
		
		return n*n;
	}
}
