package com.bajaj.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bajaj.beans.Employee;

public class TestEmployee {
	
	public static void main(String args[]) {
		
		
		ApplicationContext ac=new 
				ClassPathXmlApplicationContext("com/bajaj/resources/my_bean_configuration.xml");
		Employee employee=(Employee)ac.getBean("employee");
		
		System.out.println(employee);

	}

}
