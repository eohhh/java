package com.yedam.api;

public class StringUtil {
	static void 연결하기(String str, String str2) {
		// 문자열을 연결하는 메소드 "" + "" + ""
		System.out.println(str.concat(", ").concat(str2));
	}

	static void checkGender(String ssn) {
		// 성별을 출력. "남자" 또는"여자"
		char gen = 0;
		if (ssn.length() == 14) {
			gen = ssn.charAt(7);
			System.out.println(gen);
		} else if (ssn.length() == 13) {
			gen = ssn.charAt(6);
		}
		
//		switch(str.charAt(7 + ((str.length() - 13)) - 1 )) {
//		} =>> no1번 문제.
		
		switch (gen) {

		case '1', '3':
			System.out.println("남자입니다.");
		break;
		case '2', '4':
			System.out.println("여자입니다.");
		break;

		}
	}

	static void checkExtesion(String file) {
		// 파일의 확장자는 jpg,mp3,hwp 입니다.

		file.substring(file.indexOf(".") + 1);
		System.out.println(file.substring(file.indexOf(".") + 1));

	}

	static void getLength(String str) {
		// 문장의 길이는 ?글자입니다.
//		String str1 = str.trim();
//		str1.length();
		str.trim().length();
		System.out.println(str.trim().length());
	}

}
