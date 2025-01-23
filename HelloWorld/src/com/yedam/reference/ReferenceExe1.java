package com.yedam.reference;

public class ReferenceExe1 {

	public static void main(String[] args) {
		// double 배열선언.
		double[] dblAry = new double[5]; // <== (5개짜리 공간)서로 다른 공간
		dblAry[0] = 171.3;
		System.out.println(dblAry.length);
		for (int i = 0; i < dblAry.length; i++) {

		}

		dblAry = new double[] { 160.5, 174.6 }; // <== (2개짜리 공간)서로 다른 공간
		System.out.println(dblAry.length);

		// 배열[][] => 다차원배열.
		int[][] intAry = new int[2][3]; // 2 * 3 배열선언(배열의 크기를 나타냄)
		intAry[0][0] = 10; // 배열 intAry[0,0]의 위치의 숫자선언.
		intAry[0][1] = 20;
		intAry[0][2] = 30;
		intAry[1][0] = 20;
		intAry[1][1] = 30;
		intAry[1][2] = 40;

		// ★★ intAry[0] => 배열
		// ★★ intAry[1] => 배열
		// ★★ intAry[0][1] => 정수 [0,1]에 있는 20의 값을 가져오기 때문에 정수.

		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry[0].length; i++) {
//				System.out.println(intAry[0][i]); // 첫번째 행의 값을 전부 가져옴.
				System.out.println("[" + j + "][" + i + "] => " + intAry[j][i]);
			}
		}
	} // end of class.

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public void method1() {
		System.out.println("method1()이 호출되었습니다.");
	}

	private void method2() {
		System.out.println("method2()이 호출되었습니다.");
	}
}
