package com.assignment2;

public class Question8 {


	public static void main(String[] args) {
		Seats s = new Seats();
		s.car();
		s.engineType();
		s.runsOn();
		s.noOfSeats();
		s.wheelsCount();	
	}

}
interface Vehicles{
	public void engineType();
	void runsOn();
	void noOfSeats();
}

abstract class Sample implements Vehicles{
	abstract void car();
	void wheelsCount(){
		System.out.println("Wheels Count: "+4);
	}
	
}
abstract class Honda extends Sample{
	
	void car() {
		System.out.println("This is Cadillac car");
	}
	
}
abstract class Engine extends Honda{

	public void engineType() {
		System.out.println("V6");
	}

	public void runsOn() {
		System.out.println("Gas");
	}

}
class Seats extends Engine{
	public void noOfSeats(){
		System.out.println("No.of Seats: "+7);
	}
}