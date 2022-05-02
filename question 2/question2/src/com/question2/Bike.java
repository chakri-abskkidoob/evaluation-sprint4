package com.question2;

public class Bike {
	public synchronized void funBike(Car a1) {
		System.out.println("funBike of Bike starts");
		a1.fun1();
		System.out.println("funBike of Bike ends");
	}
	public synchronized void fun2() {
		System.out.println("inside fun2 of Bike");
	}
}
