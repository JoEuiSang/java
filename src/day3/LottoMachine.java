package day3;

import java.util.Scanner;

public class LottoMachine {
	static int ball[] = new int[6];

	public void extractBall() {
		for (int i = 0; i < 6; i++) {
			ball[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (ball[j] == ball[i]) {
					i--;
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		LottoMachine lm = new LottoMachine();
		lm.extractBall();

		int[] myLotto = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로또번호 6개 입력");
		for(int i=0; i<myLotto.length; i++) {
			myLotto[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i : ball) {
			System.out.println(i);
			for(int my : myLotto) {
				if(i == my) count++;
			}
		}
		
		System.out.println(count+"개 일치");
	}
}
