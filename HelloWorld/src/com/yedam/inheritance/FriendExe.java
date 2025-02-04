package com.yedam.inheritance;

import java.util.Scanner;

/**
 * 친구목록, 등록, 수정, 삭제. 수정: 이름, 연락처 입력.
 */
public class FriendExe {
	// 싱글톤.
	// 1. 필드선언.
	private static FriendExe instance = new FriendExe();

	// 2. 생성자 은닉.
	private FriendExe() {
	}

	// 3. 인스턴스를 반환하는 메소드.
	public static FriendExe getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[100]; // 저장공간.

	// 초기데이터 만들기.
	public void init() {
		friends[0] = new Friend("홍길동", "1111-1111");
		friends[1] = new UnivFriend("김민식", "2222-2222", "우리대학교", "복지학과");
		friends[2] = new ComFriend("박민규", "3333-3333", "인포젠", "개발팀");
	}

	Scanner scn = new Scanner(System.in);

	// 시작메소드.
	public void run() {
		boolean run = true;
		init();
		while (run) {
			System.out.println("1.친구목록 2.친구등록 3.수정 4.삭제 9.종료");
			System.out.println("메뉴를 선택하세요>> ");
			int menu = scn.nextInt();

			switch (menu) {
			case 1: // 목록.
				friendList();
				break;
			case 2: // 등록.
				addFriend();
				break;
			case 3: // 수정.
				editFriend();
				break;
			case 4: // 삭제.
				delFriend();
				break;
			case 9: // 종료.
				System.out.println("시스템을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요.");

			} // end of switch.
		} // end of while.
	} // end of run.

	// 추가메소드.

	void friendList() {

//		boolean isExist = false;
		System.out.println("친구목록");
		for (int i = 0; i < friends.length; i++) {

			if (friends[i] != null) {
				System.out.println(friends[i].showInfo());
			}
		}
	} // end of firendList.

	// 친구: 이름,연락처.
	// 학교: 친구 + 학교명, 전공.
	// 회사: 친구 + 회사명, 부서.
	void addFriend() {

		while (true) {
			System.out.println("1.친구 2.학교친구 3.회사친구 4.종료");
			System.out.print("선택>> ");
			int choice = scn.nextInt(); // 1.엔터.
			scn.nextLine();
			// 종료처리.
			if (choice == 4) {
				return; // 메소드 종료.
			}
			// 메뉴선택예외
			if (choice > 3 || choice < 1) {
				System.out.println("메뉴를 확인하세요.");
				continue;
			}

			// 이름, 연락처.
			String name = "";
			while (true) {
				System.out.print("이름입력>> ");
				name = scn.nextLine();
				// 이름의 정상값의 범위.
				if (name.length() >= 2 && name.length() <= 10) {
					break;
				} else {
					System.out.println("이름은 2글자 이상 10글자 이하...");
				}
			}
			System.out.print("연락처입력>> ");
			String phone = scn.nextLine();

			Friend friend = null;
			if (choice == 1) {
				friend = new Friend(name, phone);

			} else if (choice == 2) { // 학교,전공
				System.out.print("학교입력>> ");
				String univ = scn.nextLine();
				System.out.print("전공입력>> ");
				String major = scn.nextLine();
				friend = new UnivFriend(name, phone, univ, major);
			} else if (choice == 3) { // 회사,부서.
				System.out.print("회사입력>> ");
				String univ = scn.nextLine();
				System.out.print("부서입력>> ");
				String major = scn.nextLine();
				friend = new ComFriend(name, phone, univ, major);
			} else {
				return;
			}
			// 빈공간에 저장.
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("등록완료.");
					break;
				}
			}
		} // end of while.

	} // end of addFriend.

	void editFriend() {
		System.out.println("친구수정");
		// 친구연락처 변경. 작성!!
		String name = scn.nextLine();
		String phone = scn.nextLine();
		boolean isExist = false;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) { // get -> 비교하려고 불러온다.
				friends[i].setPhoneNumber(phone); // set -> 수정하려고 넣는다.(바꾼다) 수정할때는 set 불러와서 비교할때는 get.
				System.out.println("수정완료.");
				isExist = true;
				break;
			}
		} // end of for.
		if (!isExist) {
			System.out.println("찾는 정보가 없습니다.");
		}
	} // end of editFrined.

	void delFriend() {
		System.out.println("친구삭제");
	} // end of delFriend.
} // end of FriendExe.
