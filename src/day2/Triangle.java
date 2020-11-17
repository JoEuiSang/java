package day2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();

		for (int i = 0; i <= height; i++) {
			for(int repeat=0; repeat<=i; repeat++) {
				System.out.print("X");	
			}
			System.out.println();
		}

	}

}
