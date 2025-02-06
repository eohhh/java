package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	Employee[] employees = new Employee[10]; // 저장.
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public EmpAryExe() {
		employees[0] = (new Employee(1001, "홍길동", "1111-1111"));	// Employee을 따라가면 => (int empNo, String empName, String telNo) 실행됨.
		employees[1] = (new Employee(100, "박길동", "2222-2222"));
		employees[2] = (new Employee(10, "호빵", "3333-3333"));
		employees[3] = (new Employee(1, "호박", "4444-4444", "2000-01-01", 500));
	}
	
	@Override
	public boolean registerEmp(Employee emp) {
		for (int i = 0; i <employees.length; i++) {
			// 빈공간에 추가.
			if(employees[i] == null) {
				employees[i] = emp;
				return true; // 정상등록.
			}
		}
		return false; // 등록불가.
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // => "yyyy-MM-dd"의 형태로만 쓰겠다.(sdf에 담음)
		
		for (int i = 0; i < employees.length; i++) {
			// 값을 바꿔주기 위해 사원번호 비교.
			if (employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) { // 똑같은 사원번호 일경우에만 바꿈.
				
				// 연락처값이 ""이면 안바꿔주고 ""이 아닐때 변경.
				if(!emp.getTelNo().equals("")) {	// !emp.getTelNo().equals("") => !을 써서 공백이 아닐때로 바꿔준다.
					employees[i].setTelNo(emp.getTelNo()); // set으로 변경.. / emp에 들어있는 getTelNo를 바꾼다.
					// 따라서 공백이 아닐때(사용자가 값을 입력했을때) setTelNo(입력한값으로)를 바꾼다.
				}
				
				try {
					// 값을 변경안하려고 엔터("")일 경우 1900-01-01
					if(!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate()); // set으로 변경.. / emp에 들어있는 getTelNo를 바꾼다.
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				if(emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary()); // set으로 변경.. / emp에 들어있는 getHireDate를 바꾼다.
				}
				
//				empList.get(i).setSalary(emp.getSalary()); // set으로 변경.. / emp에 들어있는 getSalary를 바꾼다.
				return true; // 정상수정.
			}
		}		return false; // 수정을 못함.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getEmpNo() == empNo) { // 삭제
				employees[i] = null;
				return true;
		}
	} return false;
}
	
	@Override
	public Employee[] search(Employee emp) {
		Employee[] result = new Employee[10];
		int idx = 0;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpName().indexOf(emp.getEmpName()) > -1) {
					result[idx] = employees[i];
					idx++; // idx값이 0부터 하나씩 증가되도록.
			}
		}
		return result;
	}

}
