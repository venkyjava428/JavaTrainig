package com.Nerchuk.HRConnectt.EmployeeDAO;

public interface EmployeeDAO {
	String driverName = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://@localhost:3306/hr_connect";
	String userName = "root";
	String userPassword = "@@venky428##";

	public void mysqlConnect();

	public void addEmp();

	public void deleteEmp();

	public void searchEmp();

	public void updateEmp(int presentId,int modifyId);

	public void updateEmp(String presentId,String modifyId);
	public void allEmployeesList();

}
