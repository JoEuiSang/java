package day3;

public class DiceTest {

	public static void main(String[] args) {
		/*
		 * System.out.println(Math.random()); // 0.0 ~ 1.0 ���� 1.0�� ������
		 * System.out.println(Math.random() * 6); // 0.0 ~ 6.0 ���� 6.0�� ������
		 * System.out.println(Math.random() * 6 + 1); // 1.0 ~ 7.0 ���� 7.0�� ������
		 * System.out.println((int) (Math.random() * 6 + 1)); // 1 ~ 7 ���� 7�� ������
		 */	
		
		Dice dice = new Dice();
		dice.cast();
	
	}

}
