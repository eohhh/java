package com.yedam.reference;

public class StaticExe {
	public static void main(String[] args) {
		// m1,m2 => 참조변수. 실제 값이 들어가는게 아니고 주소값을 담고 있기 때문에 참조변수.(m1,m2 각각 참조하고 있는 주소값이 다르다.)
		MemberExe m1 = MemberExe.getInstance();
		MemberExe m2 = MemberExe.getInstance();
		
		System.out.println(m1 == m2);
	}
}
