package com.Assignment6;

import java.util.Scanner;

public class ThreeDimensionalTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][][] x = new int[10][10][10];
		System.out.println("Enter the Number you wish to se the multiple:");
		int a = scan.nextInt();
		System.out.println("Multiplication Table\n");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				int y = i + 1;
				int z = j + 1;
				x[a][i][j] = (a) * (y) * (z);
				System.out.println(a + "*" + y + "*" + z + "=" + x[a][i][j]);
			}
		}
	}
}
