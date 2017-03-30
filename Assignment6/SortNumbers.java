package com.Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of array you want to enter:");
		int size = sc.nextInt();
		int x[] = new int[size];
		System.out.println("Enter elements into array");
		for(int i=0; i<=x.length-1; i++){
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println("Sorted Numbers");
		for(int i=0; i<=x.length-1; i++){
			System.out.println(x[i]);
		}
	}

	}


