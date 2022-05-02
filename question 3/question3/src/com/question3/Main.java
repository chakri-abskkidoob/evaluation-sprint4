package com.question3;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Address a = new Address("Andhra Pradesh", "Ongole", 523101);
		System.out.println(a);
		Employee e = new Employee(101, "Chakri", a.toString(), "chakripasumarthi@gmail.com", "123456789");
		System.out.println(e);
		
		FileOutputStream fos = new FileOutputStream("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("e is serialized");
		
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee e1 = (Employee)obj;
		e1.funA();
//		String ss =  (String)ois.readObject();
//		System.out.println(ss);
//		int z = (Integer)ois.readObject();
//		System.out.println(z);
		System.out.println(ois);
		System.out.println("e is desirialized");
	}
}
