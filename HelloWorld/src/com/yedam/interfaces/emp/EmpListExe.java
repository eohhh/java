package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용.
 */
public class EmpListExe implements EmpDAO {
	//필드.
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간.(작성후 import)
	
	public EmpListExe() {
		// 초기값..
		empList.add(new Employee(1001, "홍길동", "1111-1111"));	// Employee을 따라가면 => (int empNo, String empName, String telNo) 실행됨.
		empList.add(new Employee(100, "박길동", "2222-2222"));
		empList.add(new Employee(10, "호빵", "3333-3333"));
		empList.add(new Employee(1, "호박", "4444-4444", "2000-01-01", 500)); // Employee을 따라가면 =>(int empNo, String empName, String telNo, String hireDate, int salary) 실행.
	}

	@Override
	public boolean registerEmp(Employee emp) { // 전달값을 충실히 저장하는 역할.
		return empList.add(emp); // 전달값을 add를 이용해 emp에 등록(저장). / add => 잘 등록되면 true, 등록이 안되면 false.가 나온다 (add특징)
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // => "yyyy-MM-dd"의 형태로만 쓰겠다.(sdf에 담음)
		
		for (int i = 0; i < empList.size(); i++) {
			// 값을 바꿔주기 위해 사원번호 비교.
			if (empList.get(i).getEmpNo() == emp.getEmpNo()) { // 똑같은 사원번호 일경우에만 바꿈.
				
				// 연락처값이 ""이면 안바꿔주고 ""이 아닐때 변경.
				if(!emp.getTelNo().equals("")) {	// !emp.getTelNo().equals("") => !을 써서 공백이 아닐때로 바꿔준다.
					empList.get(i).setTelNo(emp.getTelNo()); // set으로 변경.. / emp에 들어있는 getTelNo를 바꾼다.
					// 따라서 공백이 아닐때(사용자가 값을 입력했을때) setTelNo(입력한값으로)를 바꾼다.
				}
				
				try {
					// 값을 변경안하려고 엔터("")일 경우 1900-01-01
					if(!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate()); // set으로 변경.. / emp에 들어있는 getTelNo를 바꾼다.
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				if(emp.getSalary() != 0) {
					empList.get(i).setSalary(emp.getSalary()); // set으로 변경.. / emp에 들어있는 getHireDate를 바꾼다.
				}
				
//				empList.get(i).setSalary(emp.getSalary()); // set으로 변경.. / emp에 들어있는 getSalary를 바꾼다.
				return true; // 정상수정.
			}
		}
		return false; // 수정을 못함.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < empList.size(); i++) {
			empList.remove(i); // 삭제
			return true;
		}
		return false;
	}

	@Override
	public Employee[] search(Employee emp) { // sal 보다 급여가 많은 ..
		Employee[] result = new Employee[10];
		int idx = 0;

		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpName().indexOf(emp.getEmpName()) > -1) {
					result[idx] = empList.get(i);
					idx++; // idx값이 0부터 하나씩 증가되도록.
			}
		}
		return result; // result 값을 반환.
	}

}
