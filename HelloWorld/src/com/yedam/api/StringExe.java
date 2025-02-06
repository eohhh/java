package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {

		String ssn = "010624-4230123";
		char chr = ssn.charAt(7);
		switch (chr) { // chr=> 문자열이 아니고 문자값이기때문에 ""을 안쓰고 ''을 씀.
		case '1', '3':
			System.err.println("남자입니다.");
			break;
		case '2', '4':
			System.err.println("여자입니다.");
			break;
		default:
			System.out.println("알수 없음.");
		}

		// String str = new String(매개값); byte[]
		String str = new String(new byte[] { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 });
		System.out.println(str.charAt(1)); // 특정 문자열 반환.

		byte[] result = str.getBytes(); // 문자열 => byte[] 반환.
		for (byte b : result) {
			System.out.println(b);
		}
	}
}
