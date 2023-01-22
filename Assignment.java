package com.finserv.assignmentDay3;


import java.util.*;

public class Assignment {
	
	public void maximumOfThreeNumbers(int n1,int n2,int n3) {
		
		if(n1>n2 && n1>n3 ) {
			System.out.println(n1+" is Maximum");
		}else if(n2>n1 && n2>n3) {
			System.out.println(n2+" is Maximum");
		}else if(n3>n1 && n3>n2) {
			System.out.println(n3+" is Maximum");
		}
		
		
	}
	
	
	public void swapUsingThirdVariable(int n1 ,int n2) {
		
		int a;
		
		a=n1;
		n1=n2;
		n2=a;
		
		System.out.println(n1 +" ,"+n2);
		
		
		
	}
	
	public void swapWithoutThirdVariable(int n1,int n2) {
											//10 20
		n1=n1+n2;//30
		
		n2=n1-n2;//30-20=10
		n1=n1-n2;//30-10=20
		
		System.out.println(n1+","+n2);
		
	}
	
	
	public void checkPositiveNegativeZero(int n1) {
		
		if(n1==0) {
			System.out.println(n1+" Zero");
		}
		
		if(n1<0) {
			System.out.println(n1+" Negative");
		}
		
		if(n1>0) {
			System.out.println(n1+" Positive");
		}
		
	}
	
	public void primeNumber(int n1) {
		
		int count=0;
		
		
		for(int i=1;i<=n1;i++) {
			if(n1%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(n1+" is prime");
		}else {
			System.out.println(n1+" is not prime");
		}
		
	}
	
	public void palindrome(int n1) {
		int rem=0;
		int sum=0;
		int temp=n1;
		
		while(n1>0) {
			rem=n1%10;
			sum=sum*10+rem;
			n1=n1/10;
			
			
		}
		if(sum==temp) {
			System.out.println(temp+" is palindrome");
		}	
	}
	
	
	public static int cubeOfGivenNumber(int n) {
		
		n= n*n*n;
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment a=new Assignment();
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		a.maximumOfThreeNumbers(n1,n2,n3);
		
		a.swapUsingThirdVariable(n1,n2);
		
		
		a.swapWithoutThirdVariable(n1,n2);
		
		a.checkPositiveNegativeZero(n1);
		
		
		a.primeNumber(n1);
		
		a.palindrome(101);
		
		
		
		System.out.println(a.cubeOfGivenNumber(n1));
		
		
		
		
		
		
		
	}

}
