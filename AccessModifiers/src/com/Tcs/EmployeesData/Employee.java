package com.Tcs.EmployeesData;

public class Employee {

	private String empName; // employee name
	private String empId; // employee ID
	private String empAddress; // employee address
	private String empSalary; // employee Salary
	private String empDept; // employee Department;
	

	public String getEmpName() {
		System.out.println("Modified at 21:007");
		System.out.println("After git pull");
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		System.out.println("modified");
		return empDept;
		
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

}
