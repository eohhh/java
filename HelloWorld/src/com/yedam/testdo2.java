package com.yedam;

import java.util.Scanner;

/**
 * 친구정보관리 앱 v.1 이름,연락처,성별(남/여) => 홍길동,010-1234-1234,남 1.목록 (이름,연락처,성별) 2.등록
 * 3.조회(성별) 4.삭제(이름) 5.수정(이름) 9.종료 => 1,2,3먼저 String[] friendAry 크기는 100개 ;
 */
public class testdo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] friend = new String[100];
		friend[0] = "홍길동,1111,남";
		friend[1] = "김길동,1111,남";
		friend[2] = "무길동,1111,여";
		boolean run = true;

		while (run) {
			System.out.println("1.목록 2.등록 3.조회 4.삭제 5.수정 9.종료");
			System.out.println("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null) {
						System.out.println(friend[i]);
					}
				}
				break;
			case 2:
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] == null) {
						friend[i] = scn.nextLine();
						break;
					}
				}
				System.out.println("등록이 완료되었습니다.");
				break;
			case 3:
				String search = scn.nextLine();
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null) {
						if (search.equals(friend[i].split(",")[2])) {
							System.out.printf("%s의 성별은 %s입니다.\n", friend[i].split(",")[0], search);
						}
					}
				}
				break;
			case 4:
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null) {
						if (scn.nextLine().equals(friend[i].split(",")[0])) {
							friend[i] = null;
							break;
						}

					}
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			} // end of switch.
		} // end of while.
	}

} // end of class.
