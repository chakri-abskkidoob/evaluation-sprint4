package com.question2;

public class Car {
	public synchronized void funCar(Bike b1) {
		System.out.println("funCar of Car starts");
		b1.fun2();
		System.out.println("funCar of Car ends");
	}
	public synchronized void fun1() {
		System.out.println("inside fun1 of Car");
	}
}
