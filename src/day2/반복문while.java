package day2;

public class 반복문while {

	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			System.out.println("안녕");
			i++;
		}
		
		
		while(i<3) {
			System.out.println("하하하하");
		}
		
		//do while() : 어떤 경우에도 최소 1번은 실행한다
		
		do {
			System.out.println("do while");
		}while(i<3);
		
	}

}
