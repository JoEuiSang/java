package javaExam;

import test.Test;

public class Exam01 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
//		i = 1.1; 에러 출력 자료형이 int 임
		double ii = 1.1;

		Test t1;
		t1 = new Test();
		String s1;
		s1 = new String("abc");

		i = 20;

		// 상수 , 대문자로 선언
		final int PRICE;
		PRICE = 20;
		
		final int PRICE2 = 1000;
		
//		PRICE = 2000;  에러 final 변수는 수정 불가
	}
}
