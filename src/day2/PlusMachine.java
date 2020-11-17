package day2;

public class PlusMachine {
	//메서드 : 접근제한자, 리턴타입
	
	public int plus(int a, int b) {
		return a+b;
	}
	
	//짝수 구하는 함수
	public int evenSum(int number) {
		int sum =0;
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	//홀수 구하는 함수
		public int oddSum(int number) {
			int sum =0;
			for(int i=1; i<=number; i++) {
				if(i%2==1) {
					sum+=i;
				}
			}
			return sum;
		}
	
}
