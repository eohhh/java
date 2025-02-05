package com.yedam.test;

/*
 * interface.
 * 등록, 수정, 삭제, 조회.
 */
public interface EmpDAO {
	// boolean 사용이유 => 잘 등록,삭제..등 확인하기 위해 (true,false)를 통해서 확인할수 있다. 잘등록 => true; 등록안됨 => false;
	// 등록 
	public boolean registerEmp(Employee emp);
	// 수정
	public boolean modifyEmp(Employee emp);
	// 삭제
	public boolean removeEmp(Employee emp);
	// 조회
	public Employee[] search(Employee emp);	// Employee[]를 사용하는 이유는 모든 직원들의 정보를 불러와야 하기 때문이다.
											// true,false를 반환할 필요가 없이 모든 직원들의 정보가 필요하기 때문에 array형식으로 씀.
}
