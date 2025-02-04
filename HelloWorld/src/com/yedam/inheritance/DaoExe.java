package com.yedam.inheritance;

import java.util.Scanner;

/**
 * 실행클래스(main)
 * mysql - 소규모
 * oracle - 대규모
 */
public class DaoExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
//		MysqlDao dao = new MydqlDao();
		OracleDao dao = new OracleDao();
		
		while(run) {
			System.out.println("1.등록 2.삭제 3.조회 9.종료");
			System.out.println("메뉴를 선택하세요>> ");
			int menu = scn.nextInt();
			
			switch(menu) {
			case 1: // 등록.
				dao.register();
				break;
			case 2: // 삭제.
				dao.remove();
				break;
			case 3: // 조회.
				dao.search();
				break;
			case 9: // 종료.
				run = false;
				break;
				default:
					System.out.println("메뉴를 다시 선택하세요.");
				
			}
		}
	}
}
