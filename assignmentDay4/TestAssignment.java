package com.finserv.assignmentDay4;


import java.util.Scanner;

public class TestAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*	 Shape arr[] = new Shape[5];
		
	Shape sh = new Square(6);
	Shape ch = new Circle(6);
	Shape rh = new Rectangle(6,7);
	
	arr[0] = sh;
	arr[1] = ch;
	arr[2] = rh;
	
	
	
	
	
	for(int i=0;i<3;i++) {
	System.out.println(arr[i].calculateArea());
	}
*/
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		Shape s;
		System.out.println("Choose Shape");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("Please give your input :");

		
		
		int x=sc.nextInt();
		
		
		switch(x) {
		
		case 1:
		
		System.out.println("Enter radius :");
		int radius=sc.nextInt();
		s=new Circle(radius);
		System.out.println(s.calculateArea());
		break;
		
		
		case 2:
			
			System.out.println("Enter Side of Square :");
			int side=sc.nextInt();
			s=new Square(side);
			System.out.println(s.calculateArea());
			break;
			
		case 3:
			System.out.println("Enter Length and Breadth :");
			
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			s=new Rectangle(length,breadth);
			System.out.println(s.calculateArea());
			break;
		
		
		}
		
		
		
		

	}

}
