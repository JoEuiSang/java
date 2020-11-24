package day6.디폴트메서드;

public class MyCalculator implements Calculator {

	
	@Override
	public int plus(int i, int j) {		
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {		
		return i * j;
	}
	
	public static void main(String[] args) {
		MyCalculator my = new MyCalculator();
		System.out.println(my.plus(4, 10));
		System.out.println(my.exec(20, 30));
		

	}

}
