package day2;

public class 반복문 {

	public static void main(String[] args) {
		/*
		 * for (초기값, 조건, 증감식){
		 * 
		 * }
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 1~100까지 짝수의 합 구하기
		int sum =0;
		
		for(int i =1 ; i<1001; i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~1000까지 짝수의 합 : "+sum);
		
		PlusMachine pm = new PlusMachine();
		System.out.println("짝수합 "+pm.evenSum(500));
		System.out.println("홀수합 "+pm.oddSum(500));
		

	}

}
