package com.yedam.collections;

class Box<E> { 					// 타입(String,int..등)을 미리 선언하지말고 <E>로 선언.(언제든 바꿀수 있게.) 
	E item;						// <E> => 클래스를 '사용할 시점' 에 타입을 정하겠다.(제너릭)
	
	void setItem(E item) {
		this.item = item;
	}
	
	E getItem() {
		return item;
	}
}

public class BoyExe<E> {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
//		box.setItem("오렌지");
		box.setItem(100);
		
		Integer result = box.getItem(); // Object -> String  (Object는 모든타입이 가능하니까 casting이 가능하다.)
	}
}
