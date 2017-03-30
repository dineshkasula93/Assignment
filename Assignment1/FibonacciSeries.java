package com.Assignment1;

import java.util.*;

public class FibonacciSeries {
	void Fibonacci(){
		int i,n,c=0,s=1;
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter a number");
		 n = scan.nextInt();
		 System.out.println("Fibonacci Series is: "+ c + " " +s);
		 for(i=1; i<=n; i++){
			 int sum = c+s;
			 System.out.println(" "+sum);
			 c=s;
			 s=sum;
			 
		 }scan.close();
	}

}
