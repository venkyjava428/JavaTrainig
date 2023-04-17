package com.Tcs.EmployeesData;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.setEmpName("venky");
		e.setEmpId("1048");
		e.setEmpAddress("khammam");
		e.setEmpDept("Sr production Co-ordinater");
		e.setEmpSalary("25000");
		
		System.out.println("Employee Name "+e.getEmpName());
		System.out.println("Employee Id "+e.getEmpId());
		System.out.println("Employee Address "+e.getEmpAddress());
		System.out.println("Employee Department "+e.getEmpDept());
		System.out.println("Employee Salary "+e.getEmpSalary());
		
		System.out.println();
		
	
		

	}

}
