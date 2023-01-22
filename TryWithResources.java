package com.finserv.exceptions;


import java.util.Scanner;
public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc=new Scanner(System.in)){
			
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
	}

}
