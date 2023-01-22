package com.finserv.exceptions;



public class ExceptionQ4 {
	
	
	public static void myMethod() {
		
	try {
	
		String str=null;int a=1;
		int b=0;
		
		int div=a/b;
		
		if(str==null) {
			throw new NullPointerException("Please enter valied string");
		}
		
		
		
		
		if(b==0) {
		
			throw new DividedByZeroException("Arithemetic Exception");
		}
		
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}


