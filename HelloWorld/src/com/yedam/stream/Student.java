package com.yedam.stream;

/*
 * 학생이름, 키, 몸무게, 점수를 가지고 있는 class
 */
public class Student {
	// field.
	private String name;
	private double height;
	private double weight;
	private int score;

	// 생성자.
	public Student(String name, double height, double weight, int score) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.score = score;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
