package com.assignment2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		A a = new A();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String f = sc.nextLine();
		System.out.println("Enter last name");
		String l = sc.nextLine();
		a.name(f, l);
		sc.close();
	}

}
interface Name1{
	void name(String first, String last);
}

interface Name2{
	void name(String first, String last);
}

class A implements Name1, Name2{
	public void name(String first, String last){
		System.out.println("First Name:" +first+" Last Name:"+last);
	}
}
