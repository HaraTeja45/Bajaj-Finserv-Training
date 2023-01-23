package com.finserv.collections;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.finserv.basics.Operations;
public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations ref=(num1,num2)->{
			
			int sum=num1+num2;
			
			System.out.println("Addition ="+sum);
		};
		
		
		ref.addition(100, 200);
		
		
		
		
		
	}

}
