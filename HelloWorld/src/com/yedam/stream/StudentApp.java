package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생정보 관리 프로그램 v.1
 * 학생이름, 키, 몸무게, 점수.
 */

public class StudentApp {
	Scanner scn = new Scanner(System.in);
	boolean run = true;

	// 임시저장.
	List<Student> students = new ArrayList<>();

	public StudentApp() {
		// 초기값.
	}

	public void start() {
		while (run) {
			System.out.println("1.학생목록 2.학생추가 3.삭제 9.종료");
			System.out.println("메뉴를 선택하세요>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				studentList();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				removeStudent();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				save();
				run = false;
				break;
			default:
			}
		}
	} // end of start.

	public void studentList() {
		// 이름 점수
		// --------------
		// 홍길동 90
		System.out.println("이름		  점수");
		System.out.println("-------------");
		for (Student std : students) {
			System.out.println(" " + std.getName() + "	   " + std.getScore() + "");

		}
	} // end of studentList().

	public void addStudent() {
		
		System.out.println("학생이름 입력>> ");
		String name = scn.nextLine();
		System.out.println("키 입력>> ");
		double height = Double.parseDouble(scn.nextLine());
//		try {
//			if(scn.nextLine() == String scn.nextLine()) {
//				System.out.println("숫자를 입력하세요. ");
//				return;
//			}
////		} catch {
////			
////		}
		System.out.println("몸무게 입력>> ");
		double weight = Double.parseDouble(scn.nextLine());
		System.out.println("점수 입력>> ");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score)); // 추가(담기)
		System.out.println("등록이 완료되었습니다.");

	} // end of addStudent().

	public void removeStudent() {
		System.out.println("학생이름 입력>> ");
		String name = scn.nextLine();

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) { // 입력값과 비교해서 삭제(remove)
				students.remove(i);
				System.out.println("삭제완료.");
				return;
			}
		}
	} // end of removeStudent().

	public void save() {
		// c:/temp/studentList.txt
		try {
			Writer writer = new FileWriter("c:/temp/studentList.txt");
			// 갯수만큼 반복저장.
			for (Student std : students) {
				writer.write(
						std.getName() + " " + std.getHeight() + " " + std.getWeight() + " " + std.getScore() + " ");
				// 공백을 기준으로 할지 ,를 기준으로 할지 정한다.=>공백을기준으로..
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("save.");
	} // end of save().

	// 파일 읽어서 컬렉션 저장.
	public void init() {
		try {
			Reader reader = new FileReader("c:/temp/studentList.txt");
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				String str = br.readLine();
				if(str == null) break;
				String[] ary = str.split(" ");
				Student student = new Student(ary[0], Double.parseDouble(ary[1]), Double.parseDouble(ary[2]),
						Integer.parseInt(ary[3]));
				// ary[0] = 이름, [1] = 키, [2]= 몸무게, [3] = 점수 ==> String이 아닌 값들은 그에 맞는 매서드를 써줘야함.
				students.add(student); // 컬렉션 추가
			}
			br.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
