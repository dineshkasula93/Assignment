package com.Assignment1;

import java.util.Scanner;

public class ArmstrongNumber {
	static void Armstrong(){
		int i=0,c=0,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		c=n;
		sc.close();
		while(n!=0){
			a = n%10;
			n = n/10;
			i = i+(a*a*a);
		}
		if(c==i){
			System.out.println(c+"is Armstrong Number");
		}
		else
			System.out.println(c+"is not a Armstrong Number");
	}
	

}

