package com.yedam.api;

public class TimeExe {
	public static void main(String[] args) {
		// ?분 ?초 합은 ? 입니다. 출력.
		// 1부터 100000000 까지 250의 배수 합을 구하는 시간.
		long starTime = System.nanoTime(); // 시작 시간 읽기
//		System.currentTimeMillis(); // 현재시간을 long반환.
//		long n = 2147483647L;
//		9223372036854775807s
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
		
		long sum = 0;
		
		for (long i = 0; i <= 10000000000L; i++) {
			if (i % 250 == 0) {
				sum += i;
			}
		}
		long endTime = System.nanoTime();
		
		long min = (endTime - starTime) / (1000000000L * 60);
		long sec = (endTime - starTime) / (1000000000L);
		System.out.printf("합: %d 걸린시간 : %d 분 %d 초" , sum, min, sec);
	}
}
