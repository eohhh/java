package com.yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
//		String[] infoAry = "홍길동,80,85".split(","); -> ,를 기준으로 나눈다. // .split(나눈다라는 뜻) => String값.( 배열이 만들어짐 )
//		System.out.print(infoAry[0]);
//		System.out.print(infoAry[1]);
//		System.out.print(infoAry[2]);
//		System.out.print(Integer.parseInt("80") * Integer.parseInt("70"));

//		String[] strAry = new String[10];
//		strAry[0] = "홍길동";
//		String name = "김길동";
//		for(int i= 0; i <strAry.length; i++) {
//			if(strAry[i] == null) { // 빈공간에 등록 후 반복문 종료.
//				strAry[i] = name;
//				break;
//			}
//		} for (int i = 0; i < strAry.length; i++) {
//			System.out.println(strAry[i]);
//		}

		Scanner scn = new Scanner(System.in);
//		String searchName = scn.nextLine();
//		System.out.println("박우식".equals(searchName)); // 문자열과 문자열을 비교 할때 equals사용.// "박우식" == searchName (x)

		String[] studentAry = new String[100];
		studentAry[0] = "홍길동,80";
		studentAry[1] = "김민수,70";
		studentAry[2] = "김어진,100";
		boolean run = true;

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(단건) 4.점수조회(이름) 9. 종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록완료!");
				break;
			case 2: // 최고점수 출력. split을 사용해 점수만 빼내오기.
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // null 값이 아닐때(값이 있을 때)만 실행하세요.
						int temp = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < temp) {
							max = temp;
						}
					}
				}
				System.out.printf("최고점수는 %d\n,", max);
				break;
			case 3: // 한건씩 입력하기.
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) { // 빈공간 등록 후 반복문 종료.
						studentAry[i] = scn.nextLine();
						break;
					}
				}
				break; // break가 for문 밖에 써주면 다시 case1 으로. break가 없으면 case9로 가서 프로그램 종료.
			case 4:
				System.out.println("조회할 이름입력.");
				String searchNm = scn.nextLine();

				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						if (searchNm.equals(studentAry[i].split(",")[0])) {

							int num = Integer.parseInt(studentAry[i].split(",")[1]);
							System.out.printf("%s의 점수는 %d입니다.", searchNm, num);
							break;
						}
					}
				}
				break; // end of case 4;
			case 9:

				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			} // end of switch.

		} // end of while.

		System.out.println("end of prog.");

	} // end of main.;

}
// end of class.
