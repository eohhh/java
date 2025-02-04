package com.yedam.inheritance;
// 추상클래스.
public class AnimalExe {
	public static void main(String[] args) {
		Animal animal = null; // new Animal(); => 추상클래스는 객체 인스턴스를 만들수 없음.
		
		// 다형성. => 똑같은 객체인데 서로 다른값을 출력.
		animal = new Dog();
		animal.sound(); // 멍멍출력.
		
		animal = new Cat();
		animal.sound(); // 야옹출력.
	}
}
