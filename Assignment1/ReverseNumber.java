package com.Assignment1;

import java.util.Scanner;

public class ReverseNumber {
	void Reverse(){
		int c=0;
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n = sc.nextInt();
		 sc.close();
		 while(n!=0){
			 c = c*10;
			 c = c+ n%10;
			 n = n/10;
		 }
		 System.out.println("Reverse of a given number:" +c);
		 
	}
}
