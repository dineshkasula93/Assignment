package com.assignment2;

public class Question3 {

	public static void main(String[] args) {
		Block b = new Block(){
			public void emptyMtd() {
				System.out.println("This is interface block");
				System.out.println(Block.mtd());
			}
			{
				System.out.println("this is instance block");
			}
		};
		b.emptyMtd();
	}
	interface Block{
		static String mtd(){
			return "this is static block";
		}
		void emptyMtd();
	}
}