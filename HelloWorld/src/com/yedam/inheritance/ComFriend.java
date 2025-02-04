package com.yedam.inheritance;

/**
 * Friend(부모) 상속하는 ComFriend(자식). => 부모의 모든 정보(필드,매서드,생성자 등)를 상속받음.
 * 회사명, 부서정보.
 */

public class ComFriend extends Friend {
	private String companyName;
	private String department;
	
	public ComFriend(String friendName, String phoneNumber, String companyName, String department) {
		super(friendName, phoneNumber); // super 부모.
		this.companyName = companyName;
		this.department = department;
	}

	// getter, setter.
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
