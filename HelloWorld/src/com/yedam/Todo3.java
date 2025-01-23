package com.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[][] friend = new String[100][3]; // 100개의 정보를 3개에 나눠(독립적으로) 담는다.
		friend[0][0] = "홍길동";
		friend[0][1] = "010-1111-2222";
		friend[0][2] = "남";
		
		friend[1][0] = "홍길";
		friend[1][1] = "010-1111-2222";
		friend[1][2] = "남";
//		friend[1] = new String[] { "김민수", "010-1111-3333", "남" };
		
		while (run) {
			System.out.println("1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름) 5.수정(이름) 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				for (int j = 0; j < friend.length; j++) {
					
				for (int i = 0; i < friend[j].length; i++) {
					if ( friend[j][0] != null) {
						System.out.printf("이름: %s, 연락처: %s\n", friend[j][0], friend[j][1]);
						break;
						}	
					}
				}
				break;
			case 2:
				
				System.out.println("이름을 입력>>");
				String name = scn.nextLine();
				System.out.println("연락처를 입력>>");
				String phone = scn.nextLine();
				System.out.println("성별을 입력>>");
				String gender = scn.nextLine();
				
				friend[2][0] = name;
				friend[2][1] = phone;
				friend[2][2] = gender;
				friend[2] = new String[] { name, phone, gender };

				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null && friend[i][0] != null) {
						System.out.printf("이름은 %s, 연락처는 %s", friend[i][0], friend[i][1]);
					}
				}
				break;
			case 3:
				String search = scn.nextLine();

				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null) {

					}
				}
				break;
			case 4:
				String search1 = scn.nextLine();
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null) {

					}
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}
}
// end for class.
