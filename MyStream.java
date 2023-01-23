package com.finserv.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {

	
	
	public static void main(String args[]) {
		
		

		List<Integer> n=Arrays.asList(2,3,4,5);
		
		List<Integer> sq=n.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(sq);
		
		
	n.stream().map(x->x*x).forEach(x->System.out.println(x));
		
		
	}
}
