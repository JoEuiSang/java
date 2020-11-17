package day2;

import java.awt.Window.Type;

public class 배열예제 {

	public static void main(String[] args) {
		for(String i:args) {
			System.out.println(i);
		}
		
		System.out.println(args[0]);
		
//		args 는 모든 값이 문자열로 들어온다. 정수의 값도 문자로 들어옴
//		숫자형태인 문자를 숫자타입으로 변환하기위해서는 변환을 해줘야한다
		
		//parseInt를 이용하여 형변환 가능
		int a = Integer.parseInt(args[0]);
		
		System.out.println(a);
		
		int i1, i2, i3;
		

		i1 = 10;

		int[] arr; // 배열 선언
		arr = new int[3]; // 배열 생성

		// 배열은 앞이든 뒤든 상관업다.
		int[] arr2 = new int[5];
		int arr3[] = new int[5];

		// 배열은 크기를 수정할수없다.

		// 배열에 값 넣기
		i1 = 10;
		arr[0] = 10;

		// 값 꺼내기
		i2 = arr[0];
		
		//생성과 동시에 초기화
		int[] iarr = {1,2,3,4,5};
		int[] iarr2= new int[] {1,2,3,4,5};  //동일한 내용
		for(int i: iarr) {
			System.out.println(i);
		}

	}

}
