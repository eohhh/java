package com.yedam.reference;

public class CalculatorExe {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
//		Calculator showCalender = new Calculator();
		cal.printStar(3);	// Calculator에서 void를 사용했기 때문에 반환값이 없어서 직접입력.
		cal.printStar(3, "※"); // 매개값.
		
		Book[] bookStore = { new Book("혼공자", "신용권", "한빛미디어", 10000),
				new Book("자바스크립트 기초", "김자바", "자바출판사", 15000), 
				new Book("혼자공부하는 자바", "혼공", "한빛미디어", 20000)
		};
		
		
		Book author = cal.getBookInfo("혼자공부하는 자바", bookStore); // public String,int,blooean,Book 일때마다 맨앞 Book author를 맞게끔 바꿔줘야함.
		if (author != null) { // public String,int,blooean,Book 일때마다 (author != ???)  ???부분을 맞게끔 바꿔줘야함.
			System.out.println(author);
		} else {
			System.out.println("조회결과 없음");
		}
		
		int[] randomA = cal.randomAry(5);
		for (int num : randomA) {
			System.out.println(num);
		}
		System.out.println(cal.sum(randomA));
		
		
		int[] ary1 = { 14, 23, 11, 14, 24 };
		int[] ary2 = { 33, 23, 6, 12, 9 };
		int max = cal.getMax(cal.sum(ary1), cal.sum(ary2)); // 두개의 값중에 큰값을 반환하는 매소드와 모든 수의 합을 구하는 매소드를 활용하여 배열의 합이 큰것을 구함.
		System.out.println("배열의 합이 큰값은 " + max);
		
		double n1 = 10.5;
		double n2 = 20.5;
		double result = cal.sum(n1, n2);  // double > float > long > int > short > byte (크기순)
		result = cal.sum(new int[] {10, 20, 30, 40 ,50}); // 배열을 만들어 모두 더하기.
		
		System.out.println("결과: " + result);
		System.out.println(10);
		
	}
}
