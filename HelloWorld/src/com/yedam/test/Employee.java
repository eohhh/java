package com.yedam.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 사원번호.
 * 사원이름.
 * 전화번호.
 * 입사날짜.
 */
public class Employee {
	private int empNo;
	private String empName;
	private String empTel;
	private Date hireDate;

// 생성자.
	public Employee() {

	}

	public Employee(int empNo, String empName, String empTel) {
		this.empNo = empNo;
		this.empName = empName;
		this.empTel = empTel;
		this.hireDate = new Date();
	}

	public Employee(int empNo, String empName, String empTel, Date hireDate) {
		this(empNo, empName, empTel);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.hireDate = sdf.parse("2020-02-05");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	// 각각의 정보를 String으로 출력해주는..
	public String empInfo(int empNo, String empName, String empTel, String hireDate) {
		return empNo + " " + empName + " " + empTel + " " + hireDate + " ";
	}
	
	// getter,setter.
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpTel() {
		return empTel;
	}

	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

}
