package com.yedam.api;

public class Member {
	String memberId;
	int memPoint;
	public Member(){
		
	}
	public Member(String id, int point) {
		memberId = id;
		memPoint = point;
	}

	@Override
	public int hashCode() { // hashCode = 객체의 유니크한 값을 반환.
//		return super.hashCode(); // Object 클래스의 hashcode는 주소값을 반환해준다. (class Member가 상속받지 않기 때문에 주소값을 반환)
		return memPoint; // Object를 반환하지 말고 memPoint가 가지고 있는 객체값을 반환하겠다.(위와 비교)
	}

	@Override
	public boolean equals(Object obj) {
		// memberId가 같을경우 .. 논리적으로 같은객체(true)
		if (obj instanceof Member) {
			Member m2 = (Member) obj; // (obj) 안에 MemberId가 없기 때문에 casting을 해준다.
//		this.memberId = m2.memberId;
			if (this.memberId == m2.memberId && this.memPoint == m2.memPoint) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}
	
	
}
