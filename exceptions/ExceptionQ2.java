package com.finserv.exceptions;


import java.util.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class ExceptionQ2 {


	public void takeInput() throws FileNotFoundException,IOException{
		// throw new IOException("device error");
		
		FileReader f=new FileReader("Text.txt");
		
		//f.close();
		
		
	}
	
	
	
	public void justFun() {
		
		try {
			takeInput();
		}catch(FileNotFoundException e) {
			
			System.out.println(e);
			
		}
		catch(IOException e) {
			System.out.println(e);
		}finally {
			System.out.println("Hello from finally");
		}
		
		
			System.out.println("Just Fun");
		}
		
	
}
