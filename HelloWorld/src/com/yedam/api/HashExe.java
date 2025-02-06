package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class HashExe {
	public static void main(String[] args) {
		// 컬렉션(List, Set, Map)
		// set 컬렉션 특징 : 중복된 값은 저장이 불가.
		// hashCode + equals => 판단.(중복이 같은 객체인지 아닌지를 판단. 논리적으로 같은 객체이면 한개만 반환해줌. => set add에 예시.)
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("user01", 100)); // set.add(new Member("user01", 100)); , set.add(new Member("user01", 100));
											// => "user01" , 100이 같기때문에 한개만 반환.
		set.add(new Member("user02", 100));

		for (Member mem : set) { // mem => 반복변수(set의 변수를 하나씩 받아 저장하는..)
			System.out.println(mem.toString());
		}
	}
}
