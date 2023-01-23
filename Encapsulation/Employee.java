package com.finserv.Encapsulation;

import java.util.Objects;

public class Employee {


	 int eid;
	 String ename;
	 double salary;
	 
	 int i;
	String name;
	int d;
	public void setdata(int eid,String ename,double sal)
	{
		this.eid = eid;
		this.ename = ename;
		this.salary = sal;
	
	}
	
	public Employee()
	{
		System.out.println("Non Parametrized Constructor");
	}
	public Employee(int i, String name, int d) {
		// TODO Auto-generated constructor stub
		this.i =i;
		this.name = name;
		this.d=d;
		
	}

	public void display()
	{
		System.out.println(eid + "  " + ename + "  " + salary);
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [i=" + i + ", name=" + name + ", d=" + d + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return i == other.i;
	}
}
