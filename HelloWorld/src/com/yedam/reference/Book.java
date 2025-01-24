package com.yedam.reference;

public class Book {
	// 필드생성.
	private String bookName;
	private String name;
	private String media;
	private int won;
//	String bookRE[];
//	String search;
//	String search1;
//	String split;

	Book() {
		
	}
	// public, default, private => 접근지시자,제한자(access
	// 생성자.
	Book(String bookName, String name, String media, int won) {
		this.bookName = bookName;
		this.name = name;
		this.media = media;
		this.won = won;
	}
	
	// 제목, 저자, 가격을 보여줌(반환)
	String showBookInfo() {
		return bookName + "  " + name + "  " + won;
	}
	void showDetailInfo() {
		// 도서명: 혼공자,  출판사: 한빛미디어, 저자: 신용권, 가격: 28000
		String strFormat = "도서명: %4s\t, 출판사: %6s\n, 저자:%3s\t\t, 가격: %5d 원\n";
		System.out.printf(strFormat, bookName, media, name, won);
	}
		void printInfo() {
			System.out.printf("", bookName, name, media);
	}
		
	void setwon(int won) {
		if (won < 0) {
			this.won = 0;
			return;
		}
		this.won = won;			
	}
	
	// 우클릭 Source => Generate Getters and Setters => 밑에 수식 자동완성.
	void setMedia(String media) {
		this.media = media;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	//getter.
	public String getBookName() {
		return bookName; // 반환.
	}
	public String getName() {
		return name;
	}
	public String getMedia() {
		return media;
	}
	public int getWon() {
		return won;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}