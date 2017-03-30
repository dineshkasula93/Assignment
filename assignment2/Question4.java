package com.assignment2;

public class Question4 {
		public static void main(String[] args) {
			ExecutionCheck ec = new ExecutionCheck(){
				void bike(){
					System.out.println("Lamborgini");
				}
			};
			ec.bike();
		}

	}

	abstract class ExecutionCheck{
		static{
			System.out.println("This is static method");
		}
		{
			System.out.println("This is instance block");
		}
		abstract void bike();
	}
