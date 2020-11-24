package day6;

public interface InterA {
	static int j = 20;
	int i = 10;		//인터페이스는 멤버변수를 가질수 없기 때문에 자동으로 스태틱 변수로 선언댐
	
	//디폴트 메서드, 기본적으로 정의된 함수, 오버라이드 가능
	public default void optionMethod() {
		System.out.println("DB가 제공하는 기본적인 구현!!");
	}
	
	//스태틱 메서드, 선언 및 생성 없이 사용 가능
	public static void interAStatic() {
		System.out.println("하하하하");
	}
}
