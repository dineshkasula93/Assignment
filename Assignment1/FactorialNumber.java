package com.Assignment1;

import java.util.Scanner;

public class FactorialNumber {
	void Factorial(){
		int i,n;
		int c=1;
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 n = sc.nextInt();
		 for(i=1; i<=n; i++){
			 c = c*i;
		 }
		 System.out.println("Factorial of a given number:"+c);
		 sc.close();
	}

}

