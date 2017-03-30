package com.Assignment1;


import java.util.Scanner;

public class PerfectNumber {
	void Perfect(){
		int i,c=0,n;
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 n = sc.nextInt();
		 for(i=1; i<=n/2; i++){
			 if(n%i==0){
				 c = c+i;
			 }
		 }
		 if(c==n){
			 System.out.println(n+"is Perfect Number");
		 }
		 else{
			 System.out.println(n+"Not a Perfect Number");
		 }
		 sc.close();
	}

}
