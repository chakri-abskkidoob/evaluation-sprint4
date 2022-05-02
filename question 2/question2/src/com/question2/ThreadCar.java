package com.question2;

public class ThreadCar extends Thread {
	Car a1;
	Bike b1;
	public ThreadCar (Car a1, Bike b1) {
		this.b1 = b1;
		this.a1 = a1;
	}
	
	@Override
	public void run() {
		a1.funCar(b1);
	}
}
