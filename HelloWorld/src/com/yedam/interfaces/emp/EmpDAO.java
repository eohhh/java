package com.yedam.interfaces.emp;

/*
 * class x / interface로 생성.
 * 
 * 등록, 수정, 삭제, 조회.
 * EmparyExe.java, EmpListExe.java, EmpDBExe.java
 */

public interface EmpDAO {
	
	// 등록.
	public boolean registerEmp(Employee emp);	// Employee에 있는 모든것을 조회 후 등록하기 위해
	// 수정.
	public boolean modifyEmp(Employee emp);	// Employee에 있는 모든것을 조회 후 수정하기 위해
	// 삭제.
	public boolean removeEmp(int empNo); // 사원번호로 삭제.
	// 조회.
	public Employee[] search(Employee emp);	// Employee에 있는 모든것을 조회 하기위해.

}
