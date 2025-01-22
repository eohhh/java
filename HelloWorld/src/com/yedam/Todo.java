package com.yedam;

import java.util.Scanner; // ctrl + shift + o

// com.yedam.Todo
public class Todo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // Scanner => 사용자가 입력한 값을 읽어들임.
		// 예금액. 54000 50000 : 10만원초과: "초과금액입니다", -잔액: "잔액을 확인하세요".
		int balance = 0;
		int money = 0;
		
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요> ");
			int num = Integer.parseInt(scn.nextLine()); // 맨앞: String num = (nextLine();->문자입력반환 /맨앞 int num = nextInt
//					System.out.print(money);									// ->숫자입력반환)123213

			if (num == 1) { // 입금
				System.out.print("입금액을 입력> ");
//				System.out.print(money);
				balance = Integer.parseInt(scn.nextLine());
				if ( balance + money > 100000 ) {
					System.out.print("금액초과입니다");
				} else {
					money += balance;
					System.out.println("입금완료.");
				}
			} else if (num == 2) { // 출금
				System.out.print("출금액을 입력> ");
//				System.out.print(money);
				balance = Integer.parseInt(scn.nextLine());
				if (money < balance) {
					System.out.print("잔액을 확인하세요");
				} else {
					money -= balance;
					System.out.println("출금완료.");
				}
				
			} else if (num == 3) { // 잔액조회
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
				
			} else if (num == 4) { // 종료
				System.out.println("프로그램을 종료합니다. ");
				System.out.printf("end of prog\n");
				break;
				
			}	
		}
	}
}
