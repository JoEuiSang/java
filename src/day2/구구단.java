package day2;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		System.out.println("몇단을 출력할건가요");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}
