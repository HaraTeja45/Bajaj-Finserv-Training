package com.finserv.Encapsulation;




public class EmployeeDetails {
	
	
	
	
	public static void main(String[] args) {
	
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	emp1.setdata(101, "Uttej", 13);
	emp2.setdata(102, "Sameer", 14);
	emp1.display();
	emp2.display();
	
	emp1.setEid(1);
	emp1.setEname("Hara");
	emp1.setSalary(10);
	emp1.display();
	
	
	}
	


}
