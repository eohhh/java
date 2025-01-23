package com.yedam.reference;

public class Book {
	String bookName;
	String name;
	String media;
	int won;
	String bookRE[];
	String search;
	String search1;
	String split;

	Book() {
		
	}
	Book(String bookName, String name, String media, int won) {
		this.bookName = bookName;
		this.name = name;
		this.media = media;
		this.won = won;
	}
		void printInfo() {
			System.out.printf("이름은 %s, 영어점수 %d, 수학점수 %d\n", bookName, name, media);
		
	}
}