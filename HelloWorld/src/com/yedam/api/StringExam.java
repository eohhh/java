package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
		// 문제호출.
		연습();
		no1();
		no2();
		no3();
	}
	
	static void 연습() {
		String str = "hello";
		String str1 = "World";
		String 연결하기 = "";
	}
	static void no1() {
		String ssn = "9911224231231";
		String ssn1 = "991121 1131231";
		String ssn2 = "991122-2133333";
		StringUtil.checkGender(ssn);
	}
	static void no2() {
		//파일경로와 파일명
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringUtil.checkExtesion(file2);
	}
	static void no3() {
		// 문자의 갯수를 반환(공백제외)
		String str1 = "  suggest  ";
		String str2 = "  currently  ";
		String str3 = "  particular  ";
		StringUtil.getLength(str1);
	}
}
