package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private String empNo;
	private static String empName;
	private String telNo;
	private Date hireDate;
	private int salary;
	
	//생성자.
	public Employee() {
	}

	public Employee(String empNo, String empName, String hireDate) {
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = new Date();
		this.salary = 300;
	}
	
	public Employee(String empNo, String empname, int telNo, String hireDate, int salary ) {
		this(empNo, empName, hireDate);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			this.hireDate = sdf.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.salary = salary;
	}
	
	
	public String Employee() {
		// 사번    이름    전화번호
		// 23-11  홍길동  943-1234
		return empNo + "    " + empName + "    " + telNo;
	}
	
	
	// getter,setter.
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
} // end of class.