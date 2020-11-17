package day2;

public class 조건문IF {
	public static void main(String[] args) {
		int i = 10, j = 20;

		if (i == j) {
			System.out.println("i==j 입니다");
		} else if (i > j) {
			System.out.println("i>j 입니다");
		}else if (j> i) {
			System.out.println("j>i 입니다");
		}else {
			System.out.println("여긴 올 수 없습니다");
		}
		
		int num=100;
		
		if(num%2==0) {
			System.out.println("짝수입니다");
		}
		
	}
}
