package com.yedam.inheritance;

public class CastingExe {
	public static void main(String[] args) {
		// byte < short < int < long
		int n1 = 100;
		long n2 = 0;
		n2 = n1; // promotion 작은형변환. ( 오른쪽 값이 작을 경우 => 작은값(int)과 큰값(long)이 같다라는 식이면 작은값은 자동으로 형변환을 해준다.)
		n1 = (int) n2; // casting ( 큰값을 작은값으로 형변환 하고싶을때 (int)처럼 casting을 해줘야 한다.)
		Friend f1 = new ComFriend("", "", "", ""); // promotion.
		
//		ComFriend f2 = (ComFriend) new Friend("", ""); // casting.
		f1 = new Friend("홍길동", "1111-1111");
		System.out.println(f1.toString());
		
		
		if (f1 instanceof ComFriend) {
			ComFriend f2 = (ComFriend) f1;
			System.out.println(f2.showInfo());
		} else {
			System.out.println("형변환 못함.");
		}
	}
}
