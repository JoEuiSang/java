package day8._04Wrapper클래스;

public class Wrapper {
	public static void m1(Integer i1) {
		System.out.println(i1);
	}

	public static void main(String[] args) {
		int i = 10;
		//박싱: 기본타입 > 객체타입으로 형변환해준다.
		Wrapper.m1(i);	//오토박싱, 자동으로 기본데이터타입을, 객체타입으로 형변환해준다.
		
		
		
		
		Integer i2 = new Integer("10");
		
		int i3 = i2; //오토 언박싱, 자동으로 객체타입 > 기본타입
//		i3 = i2.intValue(); //이 작업을 자동으로 해준것
		
		Integer i4 = i3; //오토 박싱, 자동으로 기본타임>객체타임
		
		System.out.println(i4);
		System.out.println(i4.toString());
		
		
		//뢥퍼클래스의 함수를 활용
		System.out.println(Integer.MAX_VALUE);	//최대값 확인
		System.out.println(Integer.MIN_VALUE);
		
		//숫자로 이루어진 문자열을 형변환 해주는것도 뢥퍼클래스가 해준다
		
		String s = "123";
		int i5 = Integer.parseInt(s);
		System.out.println(i5);
		
		//문자가 숫자로 이루어졌는지 확인
		Character c = new Character('4');
		if(Character.isDigit(c)) {//문자 c가 숫자를 나타내면
			System.out.println(Character.getNumericValue(c)); //문자를 숫자로 변환
		}
		
		Integer ii = new Integer(10);
		Double d = new Double( 3.1234566 );

		System.out.println(Integer.parseInt("123")); //문자열을 정수로 변환
		System.out.println( Integer.parseInt( "10", 16 ) ); // 16진수 문자열을 정수로 변환 
		System.out.println( Integer.toBinaryString( 28 ) ); // 2진수로 표현된 문자열로 변환 
		System.out.println( Integer.bitCount( 28 ) ); // 2진수에서 1의 개수
		System.out.println( Integer.toHexString(28) ); // 16진수 문자열로 변환
		System.out.println( ii.doubleValue() ); //  정수를 double로 변환 
		System.out.println( d.toString() ); // Double을 문자열로 변환 
		System.out.println( Double.parseDouble("44.13e-16")); // 문자열을 double로 변환

	}
}
