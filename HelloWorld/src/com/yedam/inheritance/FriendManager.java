package com.yedam.inheritance;

public class FriendManager {
	public static void main(String[] args) {
		FriendExe app = FriendExe.getInstance();
		app.run();
		
		// 홍길동, 010-1111-1111
		// 김민수, 010-2222-2222, 예담, 역사학과
		// 박민규, 010-3333-4444, 구글, 개발팀
//		Friend[] friendAry = new Friend[10];
//		friendAry[0] = new Friend("홍길동", "010-1111-1111");
//		friendAry[1] = new ComFriend("박민규", "010-3333-4444", "구글", "개발팀");
//		
//		UnivFriend[] univAry = new UnivFriend[10];
//		friendAry[2] = new UnivFriend("김민수", "010-2222-2222", "예담", "역사학과");
	}
}
