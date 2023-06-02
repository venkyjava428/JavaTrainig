package com.Nerchuk.HRConnectt.EmployeeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.Nerchuk.HRConnectt.EmployeeDTO.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection con;
	Statement st;
	PreparedStatement pt;
	boolean t = false;
	Scanner in;
	ResultSet rs;

	@Override
	public void mysqlConnect() {

		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, userName, userPassword);
			st = con.createStatement();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	@Override
	public void addEmp() {

		in = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = in.nextInt();
		System.out.println("Enter Emp Name");
		String name = in.next();
		System.out.println("Employee Age");
		int age = in.nextInt();
		System.out.println("Enter Emp Salary");
		int salary = in.nextInt();
		System.out.println("Enter Emp Job");
		String job = in.next();
		System.out.println("Enter Emp Address");
		String address = in.next();

		Employee e = new Employee(id, name, age, salary, job, address);

		String sql = "insert into emp(empId,empName,empSalary,empJob,empAddrres,age) values(?,?,?,?,?,?)";

		try {
			pt = con.prepareStatement(sql);
			pt.setInt(1, e.getEmpId());
			pt.setString(2, e.getEmpName());
			pt.setInt(3, e.getEmpSalary());
			pt.setString(4, e.getEmpJob());
			pt.setString(5, e.getEmpAddress());
			pt.setInt(6, e.getEmpAge());
			t = pt.execute();
		} catch (SQLException a) {
			a.printStackTrace();
		} finally {

			if (t == true) {

				System.out.println("Employee Inserted Successfully");
			} else {

				System.out.println("Employee Insertion Failed");
			}

		}
	}

	@Override
	public void deleteEmp() {

		System.out.println("Enter employee Name to Delete");
		Scanner d = new Scanner(System.in);
		String nam = d.next();
		try {
			st.execute("delete from emp where empName= '" + nam + "' ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void searchEmp() {

		System.out.println("Enter employee Name to find");
		Scanner s = new Scanner(System.in);

		String find = s.next();
		System.out.println("empId, empName, empSalary, empJob, empAddrres, age");
		try {
			rs = st.executeQuery("select * from emp");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int salary = rs.getInt(3);
				String job = rs.getString(4);
				String adrss = rs.getString(5);
				int age = rs.getInt(6);

				Employee emps = new Employee(id, name, age, salary, job, adrss);

				List<Employee> l = new ArrayList<Employee>();

				l.add(emps);

				Iterator<Employee> itr = l.iterator();

				while (itr.hasNext()) {

					Employee e = itr.next();

					if (e.getEmpName().equalsIgnoreCase(find)) {

						System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " "
								+ e.getEmpJob() + " " + e.getEmpAddress() + " " + e.getEmpJob());

					}

				}

			}
		} catch (Exception a) {
			System.out.println(a);
		}

	}

	@Override
	public void updateEmp(int id, int modifyId) {

		try {
			st.executeUpdate("update  emp set empId= " + modifyId + " where empId=" + id + "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmp(String presentId, String modifyId) {

		try {
			st.executeUpdate("update  emp set empName= '" + modifyId + "' where empName='" + presentId + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void allEmployeesList() {

		System.out.println("empId, empName, empSalary, empJob, empAddrres, age");
		try {
			rs = st.executeQuery("select * from emp");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int salary = rs.getInt(3);
				String job = rs.getString(4);
				String adrss = rs.getString(5);
				int age = rs.getInt(6);

				Employee emps = new Employee(id, name, age, salary, job, adrss);

				List<Employee> l = new ArrayList<Employee>();

				l.add(emps);

				Iterator<Employee> itr = l.iterator();

				while (itr.hasNext()) {

					Employee e = itr.next();

					System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " "
							+ e.getEmpJob() + " " + e.getEmpAddress() + " " + e.getEmpJob());
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
