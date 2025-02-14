package com.yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * EmpDAO(인터페이스)를 구현하는 클래스.
 */

public class EmpDBExe implements EmpDAO {

	Connection getConnect() {

		Connection conn = null;
	try
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클DB의 접속정보.
		String user = "hr";
		String password = "hr";

		conn = DriverManager.getConnection(url, user, password);
		
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return conn;
	}

	@Override
	public boolean registerEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
//		Statement stmt = getConnect().createStatement();
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		return false;
	}

//	@Override
//	public Employee[] search(Employee emp) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Employee[] search(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		String qry =  "select * from tbl_employees " + "where emp_name = nvl('" + emp.getEmpName() + "', emp_name)" + "order by emp_no";
		try {
			//조회결과
		Statement stmt = getConnect().createStatement();
		ResultSet rs = stmt.executeQuery(qry);
		while(rs.next()) { 
			Employee empl = new Employee();
			empl.setEmpNo(rs.getInt("emp_no"));
			empl.setEmpName(rs.getString("emp_name"));
			empl.setHireDate(rs.getDate("hire_date"));
			empl.setSalary(rs.getInt("salary"));
			empl.setTelNo(rs.getString("tel_no"));
			
			empList.add(empl);
		}
		}catch(SQLException e) {
			System.err.println(e);
		}
		
		return null;
	
	}
}

	

