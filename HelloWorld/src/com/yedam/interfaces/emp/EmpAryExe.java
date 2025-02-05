package com.yedam.interfaces.emp;
/*
 * 배열활용.
 * <extends와 implements의 차이>
 * 1. extends는 일반 클래스와 abstract 클래스 상속에 사용되고, implement는 interface 상속에 사용된다.
 * 2. class가 class를 상속받을 땐 extends를 사용하고, interface가 interface를 상속 받을 땐 extends를 사용한다.
 * 
 */
public class EmpAryExe implements EmpDAO{
	
	Employee[] employee = new Employee[10]; // 저장.

	@Override
	public boolean registerEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		return null;
	}

}
