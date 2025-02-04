package com.yedam.inheritance;

/**
 * Data Access Object.
 * 추상클래스 규칙
 * MysqlDao -> register, remove, search
 * OracleDao -> register, remove, search
 * 실행클래스의 코드수정 초소화가능 => 추상클래스의 장점.
 */ 
public abstract class Dao { // abstract => 추상적인.(추상클래스) 
	// 등록.
	public abstract void register();

	// 삭제.
	public abstract void remove();

	// 조회.
	public abstract void search();
}
