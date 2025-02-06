package com.yedam.test;

public class StringUtilTest {
	static void 연결하기(String str, String str2) {
		System.out.println(str.concat(", ").concat(str2));
	}
	
	static void checkGender(String ssn) {
		// 성별을 출력. "남자" 또는 "여자" 6,7번째 번호가 1,3 => 남자 2,4=> 여자 (값이 고정되어있으므로 switch문이 적합)
		
		switch(ssn.charAt(7 + ((ssn.length() - 13)) -1)) {
		case '1' , '3' :
			System.out.println("남성입니다."); 
									// 여기서 출력하기 때문에 StrinExamTest에서는 no1(); ,no2(); , no3(); 만 해도 출력이됨.
			break;
		case '2' , '4' :
			System.out.println("여성입니다.");
			break;
			
		}
	}
	
	static void checkExtesion(String file) {
		// 파일의 확장자.
		// 공백제거
		file.substring(file.indexOf(".") + 1 ); // indexOf => "."의 위치의 인덱스를 반환(.의 위치는 8번째 입니다.. => 8 반환.)
												// substring(8)이면 8번째 인덱스부터 끝까지를 잘라서 반환.(확장자찾기완료..)
		System.out.println(file.substring(file.indexOf(".") + 1 ) + " 입니다.");
	}
	
	static void getLength(String str) {
		// 공백을 제외한 문자의 길이는 ?입니다.
		str.trim().length(); // str의 공백을 trim()으로 잘라내고 난 다음 길이.
		System.out.println(str.trim().length());
//		str.length();
	}
}
