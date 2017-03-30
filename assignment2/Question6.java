package com.assignment2;

public class Question6 {

	public static void main(String[] args) {
		Car c = new Car();
		c.wheels();
		c.name();
		c.runsOn();
	}

}
interface Vehicle{
	void name();
}
interface Type{
	void runsOn();
}

abstract class VisibilityTest implements Vehicle, Type{
	void wheels(){
		System.out.println("No. of Wheels:"+4);
	}
	public void name(){
		System.out.println("Audi");
	}
}
class Car extends VisibilityTest{
	
	public void runsOn() {
		System.out.println("Audi runs on gas");
	}
	
}