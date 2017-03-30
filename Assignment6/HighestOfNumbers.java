package com.Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class HighestOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of arrays you want to enter:");
		int count =scan.nextInt();
		int y[] = new int[count];
		System.out.println("Enter the elements in to array");
		for(int i=0; i<=y.length-1; i++){
			y[i]=scan.nextInt();
		}
		Arrays.sort(y);
		System.out.println("Sorted Numbers");
		for(int i=0;i<=y.length-1;i++){
			System.out.println(y[i]);
		}
		System.out.println("Enter the Nth higest number you want to pull");
		int z = scan.nextInt();
		if(z<count){
			System.out.println(z+" "+"Highest Number of an array: "+y[y.length-z]);
		}else{
			System.out.println("Entered number is more than size of array");
		}
	}

}
