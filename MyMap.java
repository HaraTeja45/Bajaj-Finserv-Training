package com.finserv.collections;


import  java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			myMethod();
	}
	
	
	public static void myMethod() {
		
	/*	Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101, "Hara");
		map.put(103, "uttej");
		map.put(102, "Aditya");
		map.put(104, "Rahul");
		
		
		Set<Integer> set=map.keySet();
	
		System.out.println("Using keySet");
		
		for(Integer key:set) {
			String value=map.get(key);
			
			System.out.println(key+" "+value);
		}
		
		System.out.println("Using entrySet");
		
		
		for(Map.Entry<Integer, String> entry :map.entrySet()) {
			
			Integer key=(Integer)entry.getKey();
			String value=entry.getValue();
			
			System.out.println(key+" , "+value);
			
		}
		
		
		System.out.println("Using TreeMap");
		
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
	

		map1.put(101, "Hara");
		map1.put(103, "uttej");
		map1.put(102, "Aditya");
		map1.put(105, "Rahul");
		

		for(Map.Entry<Integer, String> entry :map1.entrySet()) {
			
			Integer key=(Integer)entry.getKey();
			String value=entry.getValue();
			
			System.out.println(key+" , "+value);
			
		}
		

		System.out.println("Using LinkedHashMap");
		
		Map<Integer,String> map2=new LinkedHashMap<Integer,String>();
		

		map2.put(101, "Hara");
		map2.put(103, "uttej");
		map2.put(102, "Aditya");
		map2.put(105, "Rahul");
		
		
		for(Map.Entry<Integer, String> entry:map2.entrySet()) {
			
			
			Integer key=(Integer)entry.getKey();
			String value=entry.getValue();
			
			
			System.out.println(key+" , "+value);
			
			
		}
		
		
		*/
		
		HashMap<Employee,String> map3=new HashMap<Employee,String>();
		
		
		
		Employee emp1=new Employee(1,"ram",10.0);
		Employee emp2=new Employee(2,"shyam",18.0);
		Employee emp3=new Employee(3,"varun",15.0);
		Employee emp4=new Employee(4,"kishore",13.0);
		Employee emp5=new Employee(5,"kiran",20.0);
		
		
		map3.put(emp1,"Pune");
		map3.put(emp2,"Hyderabad");
		map3.put(emp3,"Nagaram");
		map3.put(emp4,"Vijaywada");
		map3.put(emp5,"Chennai");
		
		
		
		
		
		
	}

}
