package day3;

public class CalTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int calResult = cal.plus(10, 20);
		System.out.println(calResult);

		String str = "abc";

//		str.charAt(index) : str ���ڿ��� index��° ���ڸ� ��ȯ
		char charResult = str.charAt(0);
		System.out.println(charResult);

	}

}
