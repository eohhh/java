package com.yedam.reference;

import java.util.Scanner;

public class ReferenceExe3 {
	String aa = "sdf";
	public static void main(String[] args) {
		exe();
	}// end of main

	public static void exe() {
		Scanner scn = new Scanner(System.in);
		// 이름, 연락처, 성별 => 100개의 공간.
		String[][] friend = new String[100][3]; // 100개의 정보를 3개에 나눠(독립적으로) 담는다.
		friend[0][0] = "홍길동";
		friend[0][1] = "010-1111-2222";
		friend[0][2] = "남";
		friend[1] = new String[] { "김민수", "010-1111-3333", "남" };

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
				System.out.printf("이름은 %s, 연락처는 %s", friend[i][0], friend[i][1] );
			}
		}
	}
} // end of class.
