package com.yedam.interfaces.emp;

import java.util.Scanner;

/**
 * 사원관리 App v.1
 * 실행클래스: MainExe
 * 인터페이스 활용. (배열, 컬렉션)
 * Employee, EmpAryExe, EmpListExe, EmpDAO(인터페이스)
 */
public class MainExe {
	public static void main(String[] args) {
		// 스캐너, run
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		// 배열, 컬렉션을 활용하는 두가지 버전을 만듦.
//		EmpDAO dao = new EmpAryExe(); // => 배열을 활용하고 싶으면 EmpAryExe().
		EmpDAO dao = new EmpListExe(); // => 컬렉션을 활용하고 싶으면 EmpListExe().
		
		// 컬렉션을 활용.	
		while (run) {
			System.out.println("1.사원추가 2. 수정 3.삭제 4.조회 9.종료");
			System.out.println("메뉴를 선택하세요>> ");
			int menu = scn.nextInt();scn.nextLine();
			switch(menu) {
			case 1: // 추가. (사원번호, 이름, 전화번호)
				System.out.print("사원번호>> ");	
				int empNo = Integer.parseInt(scn.nextLine());	// 사원번호를 담는 변수선언.
				System.out.print("이름>> ");
				String eName = scn.nextLine();	// 사원이름을 담는 변수선언.
				System.out.print("전화번호입력>> ");
				String tel = scn.nextLine();	// 전화번호를 담는 변수선언.
				
				if(dao.registerEmp(new Employee(empNo, eName, tel))) { // 매개변수. 3개의 값을 한번에 받기위해 Employee 사용. / 정상실행확인을 위해 if문 사용.
					System.out.println("등록성공");
				}
				break;
				
			case 2: // 수정항목: 전화번호, 입사일자, 급여. (+ 사원번호를 기준으로 수정.)
				System.out.print("사원번호>> ");	// 어떤 사원을 수정할지 물어보는거.
				empNo = Integer.parseInt(scn.nextLine());
				System.out.print("전화번호입력>> ");
				tel = scn.nextLine();
				System.out.print("입사일자>> ");
				String hdate = scn.nextLine();
				if (hdate.equals("")) {
					hdate = "1900-01-01"; // 엔터치고 넘어가면 ..
				}
				
				System.out.print("급여>> ");
				String salString = scn.nextLine();
				if (salString.equals("")) { // 엔터치고 넘어가면 => 0으로 인식하게끔.
					salString = "0";
				}
				
				int sal = Integer.parseInt(salString); // "10" -> 10 , "" -> ?
				
				
				if(dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {	// modifyEmp에 들어있는 Employee를 불러온다. ( modifyEmp => 컨트롤 클릭.)
					System.out.println("수정완료.");	// 맨 위에서 작성한 EmpDAO dao = new EmpListExe(); => dao에 값을 바꿔주기 위해 EmpListExe로 넘어가서 바꿔주는 코드를 작성해야함.
				}
				
				break;
				
			case 3: // 삭제. 사원번호.
				System.out.println("사원번호 >>");
				empNo = Integer.parseInt(scn.nextLine());
				
				if(dao.removeEmp(empNo)) {
					System.out.println("삭제완료");
				}
				break;
				
			case 4: // 목록.
				// 조회조건(급여 이상)
//				System.out.println("조회 급여조건 >> ");
//				sal = Integer.parseInt(scn.nextLine());
				System.out.println("조회 이름조건 >> ");
				eName = scn.nextLine();
				
				Employee emp = new Employee();
				emp.setEmpName(eName);
				
				// 조회결과.
				Employee[] result = dao.search(emp); // search를 따라가보면 Employee를 담는 결과값.(그 값에 맞는 타입을 가져와야함.)
				// 출력.
				System.out.println("사번    이름    연락처       급여");
				System.out.println("-----------------------------");
				for(Employee empl : result) {
					if(empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break;
				
			case 9:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요. ");
			} // end of switch.
			
		} // end of while.
		System.out.println("end of prog.");
		
	} // end of main.
} // end of class.
