package com.yedam.test;

public class StringExamTest {
	public static void main(String[] args) {
		
		연습();
		no1();
		no2();
		no3();
	}
	
	static void 연습() {
		String str = "Hello";
		String str1 = "World";
		String 연결하기 = "";
	}
	
	static void no1() {
		String ssn = "9911223122331"; //7
		String ssn1 = "991122-3122331"; //6
		String ssn2 = "991122 1122331";
		StringUtilTest.checkGender(ssn1);
	}
	
	static void no2() {
		// 파일경로와 파일명.
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringUtilTest.checkExtesion(file1);
	}
	
	static void no3() {
		// 공백을 제외한 문자의 갯수를 반환.
		String str1 = "  suggest  ";
		String str2 = "  currently  ";
		String str3 = "  particular  ";
		StringUtilTest.getLength(str3);
	}
	
}
