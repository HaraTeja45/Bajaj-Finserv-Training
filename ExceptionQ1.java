package com.finserv.exceptions;

public class ExceptionQ1 {
	
	
	int quotient;
	public void divisionOfTwoNumbers(int a,int b) {
		
		try {
		if(b>0) {
			
		}else {
			throw new DividedByZeroException("Divided By Zero Exception Raised");
		}
		
		}catch(DividedByZeroException e) {
			
			
			System.out.println(e);
			System.out.println(e.getMessage());
			
			
			
		}
		
	}
	
	
	public void justFun() {
		System.out.println("Its enjoying");
	}

}
