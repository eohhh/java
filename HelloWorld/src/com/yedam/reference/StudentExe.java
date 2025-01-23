package com.yedam.reference;

import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		Student std1 = new Student("홍길동", 80, 85); // 인스턴스 생성.
//		std1.studentName = "홍길동";
//		std1.engScore = 80;
//		std1.mathScore = 85;
		
		Student std2 = new Student();
		std2.studentName = "김민수";
		std2.engScore = 85;
		std2.mathScore =88;
		
		Student std3 = new Student();
		std3.studentName = "홍정학";
		std3.engScore = 75;
		std3.mathScore = 90;
		
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김민지", 88, 92);
		
//		System.out.println(students[0] instanceof Student);
		
		// 학생의 이름을 입력받는 변수: studName
		// 학생의 평균을 출력하는 프로그램을 작성.
		Scanner scn = new Scanner(System.in);
		System.out.println("학생의 이름을 입력>> ");
		
		String studName = scn.nextLine(); // 사용자의 입력값을 studName에 저장
		
		for (int i = 0; i < students.length; i++) { // students.length를 반복문을 돌려서 비교.
			if (students[i] != null && students[i].studentName.equals(studName)) { // if로 students[i]가 null이 아니고 
//				student[i].studentName을 사용자의 입력값(studName)과 비교 ( String과 String를 비교하기 위해 equals를 써서 비교)
				System.out.printf("학생의 평균은 %.2f입니다. \n", students[i].getAverage()); // 학생의 평균값 출력. => %.2f는 소수점 2번째 자리까지 출력하겠다라는 뜻.
			}
		}
//		for (int i = 0; i < students.length; i++) {
//			if(students[i] != null && students[i].getAverage() >= 85) {
//				students[i].printInfo();
//				System.out.printf("이름은 %s, 영어는 %d, 수학은 %d\n", students[i].studentName, students[i].engScore, students[i].mathScore);
//			}
		}
	}

