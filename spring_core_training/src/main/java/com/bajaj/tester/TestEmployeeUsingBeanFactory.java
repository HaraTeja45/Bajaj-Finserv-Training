package com.bajaj.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bajaj.beans.Employee;



public class TestEmployeeUsingBeanFactory {
	
	
	public static void main(String args[]) {
		
		BeanFactory ac=new 
				ClassPathXmlApplicationContext("com/bajaj/resources/my_bean_configuration.xml");
	      
	    Employee employee=(Employee)ac.getBean("employee");  
	    System.out.println(employee);
	    
	    

	    ClassPathXmlApplicationContext appContext = new 
	    		ClassPathXmlApplicationContext("com/bajaj/resources/my_bean_configuration.xml");
	    // of course, an ApplicationContext is just a BeanFactory
	    BeanFactory factory = (BeanFactory) appContext;
	    
	    Employee employee1=(Employee)factory.getBean("employee1");  
	    System.out.println(employee1);
	}

}
