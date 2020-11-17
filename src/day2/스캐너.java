package day2;

import java.util.Scanner;

public class ½ºÄ³³Ê {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println(value);

		PlusMachine ps = new PlusMachine();
		System.out.println(ps.oddSum(value));
	}

}
