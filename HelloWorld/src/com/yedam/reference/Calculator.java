package com.yedam.reference;

public class Calculator {
	// CalculatorExe에서 사용하기 위해 매소드를 만드는 java.
	// 1월달 달력 출력.
	public void showCalender() {
		int spaces = 6;
		int lastDate = 28;
		String[] dateAry = new String [spaces + lastDate];
		// 배열에 값 ㅐ우기.
		for (int i = 0; i < dateAry.length; i++) {
			if (i <spaces) {
				dateAry[i] = "";
			} else {
				dateAry[i] = "" + (i + 1 - spaces);
			}
		}
		
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		for(String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println("\n===========================");
		// 공백, 말일 계산.
}
	
	public Book getBookInfo(String btitle, Book[] bookAry) {
//		Book[] bookRepo = {new Book("혼공자", "신용권", "한빛미디어", 10000), 
//				new Book("자바스크립트 기초", "김자바", "자바출판사", 15000), 
//				new Book("혼자공부하는 자바", "혼공", "한빛미디어", 20000)};

		for (int i = 0; i < bookAry.length; i++) {
			if (bookAry[i].getBookName().equals(btitle)) {
//				return bookRepo[i].getWon(); => public int 일때 (public은 5번째 줄 시작부분)
//				return bookRepo[i].getBookName(); => public String 일때
//				return true; // => public int 일때
				return bookAry[i]; // => public Book 일때
			}
	
//		return null; => public String 일때
//		return 0; // => public int 일때
//		return false; // => public int 일때
		Book[] bookStore = { new Book("혼공자", "신용권", "한빛미디어", 10000), new Book("자바스크립트 기초", "김자바", "자바출판사", 15000),
				new Book("혼자공부하는 자바", "혼공", "한빛미디어", 20000) };
	
		}
		return null; // => public Book 일때
	}


	// 배열검색.

	// 1 ~ 100 사이의 임의값을 n개 반환 하는 매소드
	public int[] randomAry(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * 100) + 1;
		}
		return result;
	}

	// 두 숫자중에서 큰 값을 반환.
	public int getMax(int num1, int num2) { // 두개의 값중에 큰값을 반환하는 매소드
		return num1 > num2 ? num1 : num2;
//		if(num1>num2) {
//			return num1;
//		}
//		return num2;
	}

	// *
	// **
	// ***
	// ****

	// void -> 반환 안함.
	// int,double 등등 => 반환(따라서 CalculatorExe에서도 사용할수 있는거임, 반환값이 있기 때문에)

	public void printStar(int times) { // 입력한 숫자만큼 별이 반환되는 매소드
		for (int i = 1; i <= times; i++) {
			printStar(i, "*");
			System.out.println();
		}
	}

	// 별 출력하는 메소드.
	public void printStar(int times, String types) { // 매개변수 int times => 공용으로 쓰고 싶은것을 구현할때 씀
		for (int i = 1; i <= times; i++) {
			System.out.print(types);
		}
	}

	// 두수의 합을 반환.
	public int sum(int num1, int num2) { // 두개의 정수를 더하는 매소드
		return num1 + num2;
	}

	// 동일한 메소드명을 중복으로 정의 : overloading.
	public double sum(double num1, double num2) { // 두개의 실수를 더하는 매소드
		return num1 + num2;
	}

	public int sum(int[] intAry) { // 모든 수의 합을 구하는 매소드.
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	} 
	
}//end of class 
	
