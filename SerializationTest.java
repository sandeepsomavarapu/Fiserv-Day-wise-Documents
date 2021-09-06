package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Emp emp = new Emp(123, "vandana", 90000);
//		FileOutputStream out = new FileOutputStream("employee1.txt");
//		ObjectOutputStream obj = new ObjectOutputStream(out);
//		obj.writeObject(emp);
//		System.out.println("done");

		FileInputStream in = new FileInputStream("employee1.txt");

		ObjectInputStream obj = new ObjectInputStream(in);

		Emp emp = (Emp) obj.readObject();

		System.out.println(emp.getEid()+" "+emp.getName()+" "+emp.getSal());
	}
}
