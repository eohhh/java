package com.yedam.reference;

import java.util.Scanner;

public class BookExe {
	/**
	 * <<도서명Str, 저자Str, 출판사Str, 판매가격int >>
	 *
	 */
	static Book[] bookRe = new Book[100]; // 정적(static) 필드.
	// 저장공간에 값을 초기값을 생성 (1)

	public static void init() {
		bookRe[0] = new Book("혼공자", "신용권", "한빛미디어", 28000);
		bookRe[1] = new Book("혼공", "신용", "한빛미디", 2800);
		bookRe[2] = new Book("혼", "신", "한빛미", 280);
	} // end of init()

	// 목록출력.
	public static void printList() {
		System.out.println("도서명   저자  가격");
		System.out.println("==================");
		for (int i = 0; i < bookRe.length; i++) {
			if (bookRe[i] != null) {
				System.out.println(bookRe[i].showBookInfo());
			}
		}
		System.out.println("==================");
	} // end of printList()

	// 도서등록.
	static Scanner scn = new Scanner(System.in); // 필드 영역으로 빼고 static영역에서 쓰려면 Scanner도 앞에 static을 넣어줘야 한다.

	public static void addBook() {
		System.out.println("도서명 입력>>");
		String bookName = scn.nextLine(); // => 문자값으로 반환.
		System.out.println("저자 입력>>");
		String name = scn.nextLine();
		System.out.println("출판사 입력>>");
		String media = scn.nextLine();
		System.out.println("가격 입력>>");
		int won = Integer.parseInt(scn.nextLine()); // => 문자값을 받아서 Int값으로 반환해야함 (Integer.parseInt)
//		 int search = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRe.length; i++) {
			if (bookRe[i] == null) { // 등록하는것은 null 위치에 등록해야함. (==)
				bookRe[i] = new Book(bookName, name, media, won);
				System.out.println("등록완료.");
				break; // for 종료.
//				 if (search.equals(bookRe[i]).split(",")[])
//				 bookRe[i] = scn.nextLine();
//				 search.equals(bookRe[i]).split(",")[]						 
			}
		}
	} // end of addBook()

	// 목록(출판사)
	public static void searchList() {
		System.out.println("출판사 입력>>");
		String media = scn.nextLine();
		System.out.println("도서명   저자  가격");
		System.out.println("==================");
		for (int i = 0; i < bookRe.length; i++) {
			if (bookRe[i] != null && bookRe[i].getMedia().equals(media)) { // bookRe[i].media => 내가 설정한 미디어와 비교.
				System.out.println(bookRe[i].showBookInfo());
			}
		}
		System.out.println("==================");
//		 String search1 = scn.nextLine();
//		 for (int i = 0; i < bookRe.length; i++) {
//			 if (bookRe[i] != null) {
////				 if (search1.equals(bookRe[i]./split(",")[0])) {
//				 bookRe[i] = search1.media;
//		 }
//	 }
	} // end of searchList()

	// 가격수정.
	public static void modifyBook() {
		System.out.println("도서명 입력>>");
		String bookName = scn.nextLine(); // 위에 이미 선언되어있는 것은 에러가 나서 String,int를 없앤다.
		System.out.println("가격 입력>>");
		int won = Integer.parseInt(scn.nextLine());
		// 도서명으로 검색 => 입력받은 값으로 필드를 변경.(수정)
		boolean isExist = false;
		for (int i = 0; i < bookRe.length; i++) {
			if (bookRe[i] != null && bookRe[i].getName().equals(bookName)) {
				bookRe[i].setwon(won);
				System.out.println("수정완료.");
				isExist = true;
				// break; // 수정완료되면 반복문 종료.
				break;
			}
		} // end of for.
		if (!isExist) {
			System.out.println("찾는 도서가 없습니다.");
		}
	} // end of modifyBook()

	// 상세조회.
	public static void search() {
		System.out.println("도서명 입력>>");
		String bookName = scn.nextLine();
		Calculator cal = new Calculator();
		cal.getBookInfo(bookName, bookRe).showDetailInfo();
//		for (int i = 0; i < bookRe.length; i++) {
//			if (bookRe[i] != null && bookRe[i].getBookName().equals(bookName)) {  //  bookRe[i].getBookName() 사용자가 입력한 북네임이랑 (getBookName = bookName )
//			                                                                      //  equals(bookName) => nextLine()의 데이터상 정의한 북네임이 있는지 비교.
//				bookRe[i].showDetailInfo(); // 상세출력 =>  북네임이 서로 일치할 경우, Book.java에 정의한 showDetailInfo()의 내용을 출력(반환).
//				break;
//			}
//		}
//		System.out.println("찾는 도서가 없습니다.");
	} // end of search()

	public static void main(String[] args) { // 정적(static) 매소드
		// 1.전체목록 2.도서등록 3.조회(출판사명을 넣으면 조회) 9.종료
		init(); // 기초데이터 생성.(2)
		boolean run = true;

		// 초기데이터.
//		Book bookRe1 = new Book("혼공자", "신용권", "한빛미디어", 28000);
//		Book bookRe2 = new Book("혼공", "신용", "한빛미디", 2800);
//		Book bookRe3 = new Book("혼", "신", "한빛미", 280);

//		Book bk1 = new Book();
//		bk1.bookName = "혼공자";
//		bk1.name = "신용권";
//		bk1.media = "한빛미디어";
//		bk1.won = 28000;
//		
//		Book bk2 = new Book();
//		bk2.bookName = "혼공";
//		bk2.name = "신용";
//		bk2.media ="한빛미디";
//		bk2.won = 2800;
//		
//		Book bk3 = new Book();
//		bk3.bookName = "혼";
//		bk3.name = "신";
//		bk3.media = "한빛미";
//		bk3.won = 280;
//		
//		bookRe[0] = bk1;
//		bookRe[1] = bk2;
//		bookRe[2] = bk3;

		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정 5.상세조회 9.종료");
			System.out.println("선택하세요>> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록출력. 도서명, 저자, 가격
				printList();
				break;
			case 2: // 도서등록
				addBook();
				break;
			case 3: // 조회
				searchList();
				break;
			case 4: // 수정.
				modifyBook();
				break;
			case 5: // 상세조회.
				search();
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
