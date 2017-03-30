package com.assignment2;

public class Question7 {

	public static void main(String[] args) {
		P ref = new C();
		ref.method1(20, 30);
		ref.method2(40, 50);
		}
	}

	class P{
		void method1(int a, int b){
			System.out.println("Parent class method1 "+a+"\t"+b);
		}
		void method2(int c, int d){
			System.out.println("Parent Class method2: "+c+"\t"+d);
		}
	}
	class C extends P{
		void method1(int a, int b){
			System.out.println("Child Class "+a+"\t"+b);
		}
		void method3(){
			int i=10;
			System.out.println(i);
		}
	}
