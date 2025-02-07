package com.yedam.api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); //인스턴스.
		today.set(Calendar.YEAR, 2024); // 필드 : 값
		today.set(2024, 1, 10); // 2024년 2월 10일 지정.
		
		int year = today.get(Calendar.YEAR); // 1,2,3
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE); // 일
		int day = today.get(Calendar.DAY_OF_WEEK); // 요일을 숫자값으로 반환
		int dayOfMonth = today.getActualMaximum(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 %d요일\n", year, month+1, date, day);
		System.out.println("말일은 " + dayOfMonth);
	}
}
