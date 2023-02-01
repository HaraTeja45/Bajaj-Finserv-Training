package com.bajaj.beans;

public class Employee {
	
	private int eId;
	private String name;
	private double salary;
	
	private Department dept;
	
	
	

	
	
	public Employee(int eId, String name, double salary, Department dept) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public Employee() {
		super();
	}

	public Department getDept() {
		return dept;
	}



	public void setDept(Department dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary +"]"+dept;
	}
	


	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void display() {
		System.out.println("Name: "+name+", "+"Salary: "+salary);
	}
	
	

}
