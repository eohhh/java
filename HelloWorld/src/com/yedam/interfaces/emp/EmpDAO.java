package com.yedam.interfaces.emp;
/*
 * class x / interface로 생성.
 * 
 * 등록, 수정, 삭제, 조회.
 */
public interface EmpDAO {
	
	// 등록.
	public boolean registerEmp(Employee emp);	// Employee에 있는 여러개로 조회 및 사용.
	// 수정.
	public boolean modifyEmp(Employee emp);	// Employee에 있는 여러개로 조회 및 사용.
	// 삭제.
	public boolean removeEmp(int empNo); // 사원번호로 삭제.
	// 조회.
	public Employee[] search(Employee emp);	// Employee에 있는 여러개로 조회 및 사용.
}
