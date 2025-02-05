package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;
import com.yedam.reference.Student;

/**
 * String[] strAty = new String[]; Collection 1) List 2) Set 3) Map 컬렉션 =>
 * add(추가) remover(삭제) get(가져오기)
 */
public class Exe {
	public static void main(String[] args) {
//		System.out.println("홍길동".indexOf("길동")); // indexOf => 비교할때
		
		
		
		
		// 학생정보를 저장하는 컬렉션(ArrayList) 선언.
		// 3명 추가.
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("홍길동", 11, 20));
		student.add(new Student("홍길", 21, 30));
		student.add(new Student("홍", 31, 40));
		
		
		// 삭제.
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getStudentName().equals("홍길동"));
			// students[i]
			student.remove(i);
			break;
		}
		
		
		// 출력.(반복문)
		for (int i = 0; i < student.size(); i++) {
			student.get(i).printInfo();
		}

	}

	void method() {
		String[] strAry = new String[10]; // 배열.
		List<String> strList = new ArrayList<String>(); // 컬렉션.. / List => 인터페이스 / ArrayList => 클래스.
		List<Friend> friends = new ArrayList<Friend>();

		friends.add(new Friend("홍길동", "1111-1111"));
		// Friend => public Friend(String friendName, String phoneNumber)이기 때문에 위와 같이
		// 적어야 함.
		friends.add(new ComFriend("김길동", "1111-1111", "국민은행", "신용보증팀"));
		// ComFriend => public ComFriend(String friendName, String phoneNumber, String
		// companyName, String department)
		// 정의된 내용으로 적어야만 적용가능. / "반갑습니다","안녕하세요" => 에러.

		friends.remove(new Friend("홍길동", "1111-1111"));
		System.out.println("friends크기: " + friends.size()); // 주소가 다르기 때문에 삭제 불가. => [0],[1]... 으로 삭제.

		System.out.println(friends.get(1).getFriendName());

		// 추가.
		strList.add("안녕하세요"); // 첫번째 위치 추가(add).
		strList.add("Hello"); // 두번째 위치 추가(add).
		strList.add("반갑습니다"); // 세번째 위치 추가(add).
		System.out.println("strList크기: " + strList.size()); // 몇개인지? size.

		// 삭제.
//		strList.remove(0); // 삭제할 목록의 순서를 적어준다. => [0]번째 삭제.
//		strList.remove("Hello"); // 삭제할 객체를 넣어준다. => "Hello" 삭제.
//		System.out.println(strList);
		System.out.println("strList크기: " + strList.size()); // [0]번째와 "Hello"를 삭제. "반갑습니다" 1개만 남아서 size:1

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i)); // 값을 가져올때 get.
		}
	} // end of method.
}// end of Exe.
