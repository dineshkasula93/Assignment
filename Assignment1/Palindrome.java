package com.Assignment1;

import java.util.Scanner;

public class Palindrome {
	void pal(){
		int c=0,i;
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n = sc.nextInt();
		 i=n;
		 sc.close();
		 while(n!=0){
			 c = c*10;
			 c = c+ n%10;
			 n = n/10;
		 }
		 if(c==i)
		 System.out.println(c+"is Palindrome");
		 else
			 System.out.println(c+"Not a Palindrome");
	}

}

