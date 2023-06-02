package com.Nerchuk.HRConnectt.EmployeeBusiness.Test;

import java.util.Scanner;

import com.Nerchuk.HRConnectt.EmployeeDAO.EmployeeDAO;
import com.Nerchuk.HRConnectt.EmployeeDAO.EmployeeDAOImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeDAO d = new EmployeeDAOImpl();

		while (true) {
			Scanner in1 = new Scanner(System.in);
			System.out.println("1. ADD Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Delete Employee");
			System.out.println("4:Search Employee");
			System.out.println("5:Update Employee");
			System.out.println("6. Exit");

			int choice = in1.nextInt();

			switch (choice) {

			case 1:
				d.mysqlConnect();
				d.addEmp();

				break;

			case 2:

				d.mysqlConnect();
				d.allEmployeesList();
				break;
			case 3:
				d.mysqlConnect();
				d.deleteEmp();
				break;
			case 4:
				d.mysqlConnect();
				d.searchEmp();
				break;
			case 5:
				d.mysqlConnect();
				Scanner up = new Scanner(System.in);

				System.out.println("What You Want To update ");

				System.out.println("1:Employee ID");
				System.out.println("2:Employee Name");
				System.out.println("3:Employee Salary");
				System.out.println("4:Employee Job");
				System.out.println("5:Employee Address");
				System.out.println("6:Employee Age");

				int update = up.nextInt();

				switch (update) {

				case 1:
					System.out.println("Enter ID");
					int id=up.nextInt();
					System.out.println("Update Id");
					int UpdateId=up.nextInt();
					d.mysqlConnect();
					d.updateEmp(id,UpdateId);
					
					break;
				case 2:
					System.out.println("Enter Name");
					String name=up.next();
					System.out.println("Update Name");
					String UpdateName=up.next();
					d.mysqlConnect();
					d.updateEmp(name,UpdateName);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;

				}

				break;
			case 6:
				break;
			default:
				break;

			}

		}
	}

}
