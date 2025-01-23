package com.yedam.reference;

public class Reference2 {
	public static void main(String[] args) {
		String[][] intAry = new String[5][2];
//		String[][] intAry = {{"홍길동", "80"}, {"김민수","85"}};

		intAry[0][0] = "홍길동";
		intAry[0][1] = "80";
		intAry[1][0] = "김민수";
		intAry[1][1] = "85";
		intAry[2][0] = "박헌수";
		intAry[2][1] = "88";
		intAry[3][0] = "심상현";
		intAry[3][1] = "90";
		intAry[4][0] = "최기동";
		intAry[4][1] = "75";

		int sum = 0;
		int max = 0;
		String[] temp = { "","0" };
		
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("점수=> " + intAry[i][1]);
			// sum값에 누적
			sum = sum + Integer.parseInt(intAry[i][1]);
			// 최고점수
			if (max < Integer.parseInt(intAry[i][1])) {
				max = Integer.parseInt(intAry[i][1]);
			}
			//최고점수를 받은 학생.
			if (Integer.parseInt(temp[1]) < Integer.parseInt(intAry[i][1])) {
				temp = intAry[i];
			}
		}
		System.out.printf("sum의 값은 %d\n", sum);
		System.out.printf("제일 높은 점수는 %d\n", max);
		System.out.printf("최고점 학생은 %s\n", temp[0]);
	}
}
