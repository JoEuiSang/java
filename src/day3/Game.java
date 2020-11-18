package day3;

import java.util.Scanner;

public class Game {
	int gameNum;
	Scanner sc = new Scanner(System.in);
	
	
	public Game() {
		System.out.println("게임을 선택하세요\n1.주사위게임");
		gameNum = sc.nextInt();
		
		if(gameNum == 1) {
			Dice dice = new Dice();
			dice.cast();
		}
	}
	
	
	
	
	

}
