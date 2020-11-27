package day8._02string.실습;

public class _03 {

	public static void main(String[] args) {
		/*
		1) “aBcAbCabcABC” 문자열 String 객체를 생성한다.
	 	2) 3번째 문자열 출력한다,
	 	3) “abc”문자열이 처음으로 나타나는 인덱스를 추적한다.
	 	4) 위 문자열의 문자 개수를 출력한다.
	 	5) ‘a’를 ‘R’로 대체한 결과를 출력한다. 
		6) “abc”문자열을 “123’문자열로 대체한 결과를 출력한다.
	 	7) 처음 3개의 문자열만을 출력한다.
	 	8) 문자열을 모두 대문자로 변경하여 출력한다
	 */
		//1
		String abc = new String("aBcAbCabcABC");
		//2
		System.out.println(abc.charAt(3));
		//3
		System.out.println(abc.indexOf("abc"));		
		//4
		System.out.println(abc.length());
		//5
		System.out.println(abc.replace("a", "R"));
		//6
		System.out.println(abc.replace("abc", "123"));
		//7
		System.out.println(abc.substring(0,3));
		//8
		System.out.println(abc.toUpperCase());
	}
}
