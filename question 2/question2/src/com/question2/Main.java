package com.question2;

public class Main {
	public static void main(String[] args) {
		Car a1 = new Car();
		Bike b1 = new Bike();
		
		ThreadCar c1 = new ThreadCar(a1, b1);
		ThreadBike c2 = new ThreadBike(a1, b1);
		c1.start();
		c2.start();
	}
}
