package day3;

import java.util.Scanner;

public class Game {
	int gameNum;
	Scanner sc = new Scanner(System.in);
	
	
	public Game() {
		System.out.println("������ �����ϼ���\n1.�ֻ�������");
		gameNum = sc.nextInt();
		
		if(gameNum == 1) {
			Dice dice = new Dice();
			dice.cast();
		}
	}
	
	
	
	
	

}
