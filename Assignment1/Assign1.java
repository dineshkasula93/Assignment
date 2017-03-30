package com.Assignment1;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Minimum m = new Minimum();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = s.nextInt();
			System.out.println("Enter b value");
			int b = s.nextInt();
			System.out.println("Enter c value");
			int c = s.nextInt();
			System.out.println("Enter d value");
			int d = s.nextInt();
			System.out.println("Minimum of 4 numbers is:"+m.min(a, b, c, d));
			OddNumbers o = new OddNumbers();
			o.Odd();
			PrimeNumber p = new PrimeNumber();
			p.Prime();
			ReverseNumber r= new ReverseNumber();
			r.Reverse();
			ArmstrongNumber ar = new ArmstrongNumber();
			ar.Armstrong();
			Palindrome pa = new Palindrome();
			pa.pal();
			FactorialNumber fn = new FactorialNumber();
			fn.Factorial();
			FibonacciSeries fs = new FibonacciSeries();
			fs.Fibonacci();
			PerfectNumber pn = new PerfectNumber();
			pn.Perfect();
			s.close();
			

	}

}
