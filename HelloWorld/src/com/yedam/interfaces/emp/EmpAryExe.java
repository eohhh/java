package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

/*
 * 배열활용.
 * <extends와 implements의 차이>
 * 1. extends는 일반 클래스와 abstract 클래스 상속에 사용되고, implement는 interface 상속에 사용된다.
 * 2. class가 class를 상속받을 땐 extends를 사용하고, interface가 interface를 상속 받을 땐 extends를 사용한다.
 * 
 */
public class EmpAryExe implements EmpDAO{
	
	Employee[] employee = new Employee[10]; // 저장.
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public EmpAryExe() {
		employee[0] = (new Employee(1001, "홍길동", "1111-1111"));	// Employee을 따라가면 => (int empNo, String empName, String telNo) 실행됨.
		employee[1] = (new Employee(100, "박길동", "2222-2222"));
		employee[2] = (new Employee(10, "호빵", "3333-3333"));
		employee[3] = (new Employee(1, "호박", "4444-4444", "2000-01-01", 500));
	}
	
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
		Employee[] result = new Employee[10];
		int idx = 0;

		for (int i = 0; i < employee.length; i++) {
			if (employee[i] != null && employee[i].getEmpName().indexOf(emp.getEmpName()) > -1) {
					result[idx] = employee[i];
					idx++; // idx값이 0부터 하나씩 증가되도록.
			}
		}
		return result;
	}

}
