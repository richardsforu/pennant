package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeService();

		// memu driven apps
		while (true) {

			System.out.println("---- MENU ----");
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Find");
			System.out.println("4.Update");
			System.out.println("5.Remove");
			System.out.println("6.Backup data");
			System.out.println("7.Restore");
			System.out.println("8.Exit");
			System.out.println("Enter your Choice: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				Employee employee = new Employee(87, "Dao", 76433);
				es.saveEmployee(employee);
				System.out.println("Employee Saved");
				break;
			case 2:
				List<Employee> emps = es.findAll();
				for (Employee emp : emps) {
					System.out.println(emp.getEmpId());
					System.out.println(emp.getEmpName());
					System.out.println(emp.getSalary());
					System.out.println("----------------");
				}
				break;
			case 3:
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				Employee emp = es.findById(id);
				if (emp != null) {
					System.out.println(emp.getEmpId());
					System.out.println(emp.getEmpName());
					System.out.println(emp.getSalary());
					System.out.println("----------------");
				} else {
					System.out.println("--- No recrod found with ID " + id);
				}
				break;
			case 4:
				System.out.println("Enter Id to Update: ");
				id = sc.nextInt();
				emp = es.findById(id);
				boolean status = false;
				if (emp != null) {
					status = es.updateEmployee(id, new Employee(1111, "AAAA", 22222));
				}

				if (status) {
					System.out.println("--- Updated");
				} else {
					System.out.println("EMployee Id not found " + id);
				}
				break;

			case 5:
				System.out.println("Enter Id to Remove: ");
				id = sc.nextInt();
				status = false;
				status = es.removeEmployee(id);
				if (status) {
					System.out.println("removed");
				} else {
					System.out.println("Emloyee Id not found " + id);
				}
				break;

			case 8:
				System.exit(0);

			}

		}

	}

}
