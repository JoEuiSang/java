package day8._02string.실습;

public class _04 {
	public static void main(String[] args) {
		String a = new String("abcd");
		String b = new String(",efg");

		// 문자열 연결
		a = a.concat(b);
		System.out.println(a);

		// 공백제거
		a = a.trim();
		System.out.println("---" + a + "---");

		// 문자열 대치
		a = a.replace("ab", "12");
		System.out.println(a);

		// 문자열 분리
		String s[] = a.split(",");
		for(String i : s) {
			System.out.println(i);
		}
		
		//서브스트링
		a=a.substring(3);
		System.out.println(a);
		
		//문자열의 문자
		char c = a.charAt(2);
		System.out.println(c);
		
	}
}
