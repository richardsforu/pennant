package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(348784);

		try {

			FileOutputStream fos = new FileOutputStream("./emp.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);

			System.out.println("---- Writing is done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
