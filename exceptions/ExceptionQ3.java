package com.finserv.exceptions;



import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;



public class ExceptionQ3 {
	
	public static void temp() throws IOException ,FileNotFoundException{
	
	PrintWriter p=new PrintWriter("file3.txt");
	
	BufferedReader br=new BufferedReader(new FileReader("file1.txt"));

	String line=br.readLine();
	
	
	
	while(line !=null) {
		
		p.println(line);
		line=br.readLine();
	}
	
	
	br=new BufferedReader(new FileReader("file2.txt"));
	line=br.readLine();
	
	 while(line != null)
     {
         p.println(line);
         line = br.readLine();
     }
	 
	  
       
     System.out.println("Merged file1.txt and file2.txt into file3.txt");
     
    	}

     
public void justFun() {
	// TODO Auto-generated method stub
	    	 try {
    		 
    		 temp();
    	 }catch(IOException e) {
    		 
    		 System.out.println("In Catch Block");
    		 System.out.println(e);
    	 
}
}
}