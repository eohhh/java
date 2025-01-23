package com.yedam.reference;

import java.util.Scanner;

public class BookExe {
	/**
	 * <<도서명Str, 저자Str, 출판사Str, 판매가격int >>
	 *
	 */
	public static void main(String[] args) {
		// 1.전체목록 2.도서등록 3.조회(출판사명을 넣으면 조회) 9.종료
		Scanner scn = new Scanner(System.in);
		Book[] bookRe = new Book[100];
//		Book bookRe1 = new Book("혼공자", "신용권", "한빛미디어", 28000);
//		Book bookRe2 = new Book("혼공", "신용", "한빛미디", 2800);
//		Book bookRe3 = new Book("혼", "신", "한빛미", 280);
		
		Book bk1 = new Book();
		bk1.bookName = "혼공자";
		bk1.name = "신용권";
		bk1.media = "한빛미디어";
		bk1.won = 28000;
		
		Book bk2 = new Book();
		bk2.bookName = "혼공";
		bk2.name = "신용";
		bk2.media ="한빛미디";
		bk2.won = 2800;
		
		Book bk3 = new Book();
		bk3.bookName = "혼";
		bk3.name = "신";
		bk3.media = "한빛미";
		bk3.won = 280;
		
		bookRe[0] = bk1;
		bookRe[1] = bk2;
		bookRe[2] = bk3;
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 9.종료");
			System.out.println("선택하세요>> ");
			 int menu = Integer.parseInt(scn.nextLine());
			 
			 switch(menu) {
			 case 1:
				 for (int i = 0; i < bookRe.length; i++) {
					 if (bookRe[i] != null) {
						 System.out.println(bookRe[i].bookName);						 
					 }
				 }
				 break;
			 case 2:
				 int search = Integer.parseInt(scn.nextLine());
				 for (int i = 0; i < bookRe.length; i++) {
					 if (bookRe[i] == null) {
//						 if (search.equals(bookRe[i]).split(",")[])
//						 bookRe[i] = scn.nextLine();
//						 search.equals(bookRe[i]).split(",")[]
						 
						 break;
					 }
				 }
				 break;
			 case 3:
				 String search1 = scn.nextLine();
				 for (int i = 0; i < bookRe.length; i++) {
					 if (bookRe[i] != null) {
						 if (search1.equals(bookRe[i].split(",")[0])) {
						 
					 }	 bookRe[i] = null;
						 }
					 }
				 break;
			 case 9:
				 System.out.println("시스템을 종료합니다.");
				 run = false;
				 break;
				 default:
					 System.out.println("메뉴를 다시 선택하세요.");
		
			 }
			 } 
		} 
	} 
 
