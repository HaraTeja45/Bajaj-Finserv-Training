package com.finserv.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyCollections.myArrayList();
	}
	
	
	
	public static void myArrayList() {
		
		
		
		
		List<String> list=new ArrayList<String>();
		
		
		list.add("hara");
		list.add("Uttej");
		list.add("rahul");
		list.add("shanarsh");
		
		
		System.out.println(list);
		
		System.out.println("Simple For");
		
		
		for(int i=0;i<list.size();i++) {
			
			
			
			String name=list.get(i);
			
			System.out.println(name);
		}
		
		
		
		System.out.println("Using advance For");
		
		
		
		for(String name:list) {
			System.out.println(name);
		}
		
		
		System.out.println("Using Iterator");
		
		
		Iterator it= list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
