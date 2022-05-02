package com.question2;

public class ThreadBike extends Thread{
	Car a1;
	Bike b1;
	public ThreadBike(Car a1, Bike b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	
	@Override
	public void run() {
		b1.funBike(a1);
	}
}
