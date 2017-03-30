package com.assignment2;

public class Question5 {
	public static void main(String[] args) {
		TestProgram tp = new TestProgram();
	}
}

class TestProgram{
	static{
		System.out.println("This is static Block");
	}

	{
		System.out.println("Lamborgini is fastest car");	
	}
	TestProgram(){
		System.out.println("This is Constructor block");
	}
}
