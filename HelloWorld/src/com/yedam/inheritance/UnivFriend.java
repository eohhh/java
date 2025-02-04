package com.yedam.inheritance;

/**
 * 학교정보.
 */

public class UnivFriend extends Friend {
	// 필드.

	private String univName;
	private String univMajor;
	private BloodType btype;
	
	// 생성자.
	public UnivFriend(String friendName, String phoneNumber, String univName, String univMajor) {
		super(friendName, phoneNumber);
			
		this.univName = univName;
		this.univMajor = univMajor;
	}
	
	// showInfo(재정의) -> 학교정보추가.
	
	@Override // Override(재생하다) ==> 부모가 가지고 있는 정보들을 체크해주는 역할.
	public String showInfo() {
		return super.showInfo() + ", 학교: " + univName; // 부모(Friend)요소에서 정의한 showInfo에 학교정보를 추가.
	}
	
	// getter,setter.

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivMajor() {
		return univMajor;
	}

	public void setUnivMajor(String univMajor) {
		this.univMajor = univMajor;
	}
	
}
