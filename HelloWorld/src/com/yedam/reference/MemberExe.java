package com.yedam.reference;

public class MemberExe {
	// 싱글톤객체 생성.
	private static MemberExe instance = new MemberExe(); // static 필드선언.(외부에서 접근,호출하지 못하게 private.)
	// 1. 필드를 static(정적필드로) 선언.
	
	private MemberExe() {
		// 2. 생성자 은닉. (private)		
	}
	
	public static MemberExe getInstance() {
		return new MemberExe();
		// 3. 인스턴스를 제공해주는 메소드. getInstance();
	}
	
	static Member[] members = {
			new Member("user01", "1111", "홍길동"),
			new Member("user02", "2222", "김민수"),
			new Member("user03", "3333", "박석민")};

	
	public static String login(String id, String password) {
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null && members[i].getMemberId().equals(id) && members[i].getPassword().equals(password)) { // id,password 일치하는지 확인.
				return members[i].getMemberName(); // id, password 일치.
			}
		}
			return null; // 일치하는 값이 없음.
	}
}
/*
 * 정적매소드 => static.
 * static이 없는 매소드 => 인스턴스
 * 정적매소드는 바로 사용할 준비가 됨.
 * 정적매소드 없는 매소드는 인스턴스를 선언해야 사용가능.
 * 
 * //	MemberExe exe = new MemberExe(); // 인스턴스선언.
 * */