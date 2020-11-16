package javaExam;

public class Exam02 {

	public static void main(String[] args) {
		// 형변환
		int i = 20;
		long cup = i;
		
		i = (int)cup; //형변환, 타입캐스팅
		
		float f = 11.1f;
		
//		cup = f; 에러 출력 실수와 , 정수의 차이
		
		
		cup = (long)f; //
		System.out.println(cup);

	}

}
