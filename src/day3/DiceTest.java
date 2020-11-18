package day3;

public class DiceTest {

	public static void main(String[] args) {
		/*
		 * System.out.println(Math.random()); // 0.0 ~ 1.0 사이 1.0은 미포함
		 * System.out.println(Math.random() * 6); // 0.0 ~ 6.0 사이 6.0은 미포함
		 * System.out.println(Math.random() * 6 + 1); // 1.0 ~ 7.0 사이 7.0은 미포함
		 * System.out.println((int) (Math.random() * 6 + 1)); // 1 ~ 7 사이 7은 미포함
		 */	
		
		Dice dice = new Dice();
		dice.cast();
	
	}

}
