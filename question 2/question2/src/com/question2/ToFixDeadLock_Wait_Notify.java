package com.question2;

public class ToFixDeadLock_Wait_Notify {
	public static void main(String[] args) {
		System.out.println("Dead Lock :");
		System.out.println("A lock without key is Deadlock");
		System.out.println("If two threads are waiting for each over forever");
		System.out.println("The synchronized keyword is the only reason for deadlock");
		System.out.println("--------------------------------------------------------");
		System.out.println("wait() :");
		System.out.println("Once a thread calls wait() method on any object, firdt it releases the lock immediately of that particular object and then it enters into waiting state immediately");
		System.out.println("---------------------------------------------------------");
		System.out.println("notify() :");
		System.out.println("Once a thread calls notify() method on any object it also release the lock but not immediately");
	}
}



