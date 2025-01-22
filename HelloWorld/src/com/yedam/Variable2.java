package com.yedam;

public class Variable2 {

	public static void main(String[] args) {
		
		for(int j = 1; j <= 9; j++) {		// j값이 1일때 i값은 2~9까지 반환. j값이 2일때 i값은 2~9까지 반환. => 반복
		
		for (int i = 2; i <= 9; i++) {
//			System.out.print(num + " * " + i + " = " + num * i + "\n");
//			System.out.printf("%d * %d = %d  ", j, i, j * i); //  =>  `${num} * ${i} = ${num*i}`의 스크립트와 같은 문구
			System.out.print(i + " X " + j + " = " + (j * i) + " \t ");
		}
		System.out.println("end of prog");
	}
  }
}