package com.Assignment1;

import java.util.Scanner;

public class PrimeNumber {
	void Prime(){
		 int i,m=0,flag=0;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n = sc.nextInt();
		  m=n/2;    
		  for(i=2;i<=m;i++){    
		   if(n%i==0){
			   System.out.println(n+" is not a Prime Number");
		   flag=1;    
		   break;    
		   }
		  } 
		  if(flag==0)    
			  System.out.println(n+ "is a Prime Number");
		  sc.close();
	}

}
