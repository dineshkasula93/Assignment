package com.Assignment6;

import java.util.Scanner;

public class TwoDimensionalArrayMultiplication {
	Scanner scan;

	public void methodToTakeInputs() {
		scan = new Scanner(System.in);
		System.out.println("Enter the number of multple needed to display:");
		int lengthOfArray = scan.nextInt();
		int[][] x = new int[lengthOfArray][lengthOfArray];
		System.out.println("Enter the Number you wish to se the multiple:");
		int a = scan.nextInt();
		System.out.println("Multiplication Table\n");
		for (int i = 0; i < x.length; i++) {
			int y = i + 1;
			x[a][i] = (a) * (y);
			System.out.println(a + "*" + y + "=" + x[a][i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimensionalArrayMultiplication n = new TwoDimensionalArrayMultiplication();
		n.methodToTakeInputs();
	}
}
