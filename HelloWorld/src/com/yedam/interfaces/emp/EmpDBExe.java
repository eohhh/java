package com.yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
	public boolean registerEmp(Employee emp) { // 등록
		
		String query =  "insert into tbl_employees ";
		query += "values (" +emp.getEmpNo() //
				+", " +emp.getEmpName()
				+", " +emp.getTelNo()
				+")";
		try {
			Statement stmt = getConnect().createStatement();
			int r =stmt.executeUpdate(query);
			if (r > 0) {
				return true;
			}
	}catch (Exception e) {
		return false;
		
	} return true;
	}
	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sql = "UPDATE tbl_employees "
				+ "SET tel_no =  nvl('"+ emp.getTelNo() + "', tel_no),"
				+ "    hire_date = CASE to_date('" + sdf.format(emp.getHireDate())+"', 'yyyy-mm-dd')"
				+ "				   WHEN to_date('1900-01-01','yyyy-mm-dd') THEN hire_date"
				+ "                ELSE to_date('" + sdf.format(emp.getHireDate())+"','yyyy-mm-dd')"
				+ "                END,"
				+ "    salary = CASE + " + emp.getSalary() + " WHEN 0 THEN salary"
				+ "                        ELSE " +emp.getSalary()
				+ "             END "
				+ "WHERE emp_no = " + emp.getEmpNo();
				
//		sql = "update tbl_employees "
			try {
			Statement stmt = getConnect().createStatement();
			int r =stmt.executeUpdate(sql); // 처리된 건수.
			if(r > 0)
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
	}

	
	@Override
	public boolean removeEmp(int empNo) {
		String sql = "delete from tbl_employees where emp_no = " + empNo;
		try {
		Statement stmt = getConnect().createStatement();
		int r =stmt.executeUpdate(sql);
		if(r > 0)
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
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

	

