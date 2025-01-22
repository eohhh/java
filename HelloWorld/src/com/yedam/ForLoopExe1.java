package com.yedam;

import java.util.Scanner;

/**
 * 학생점수 입력 받아서 배열저장. 최고점수, 평균, 합계점수 출력.
 */
public class ForLoopExe1 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		// 정수배열. []
		int[] scores = new int[3];

		while (run) {
			System.out.println("1.학생점수 입력 2.최고점수 3.평균,점수합계 4.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생점수입력.
				for(int i = 0; i < scores.length; i++) {
					System.out.print("점수를 입력하세요.> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.print("입력완료.");
				break;
			case 2: // 최고점 출력.
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if ( max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고점은 %d입니다.\n", max);
				break;
			case 3:
				int sum = 0; // 합계, 평균.
				double avg = 0; //34.5555
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = 0; // int와 int의 연산결과는 int. ( * 1.0 => int타입을 double타입으로 형변환.)
				System.out.printf("합계는 %d, 평균은 %f입니다.\n", sum, avg);
				break;

			case 4: 
				System.out.print("프로그램을 종료합니다. ");
				run = false;
				break;
			default:
				System.out.print("메뉴를 다시 선택하세요. "); // 없는 메뉴를 선택했을때 default
			}
		}
		System.out.println("end of prog.");
	}
}