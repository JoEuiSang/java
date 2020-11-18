package day3;

public class Constructor { 
 
//	클래스의 이름과 똑같다, 오버로딩 가능
//	기본 생성자, 선언이 안되어 있더라도 컴파일과정에서 자동 생성
//	인스턴스가 생성될 때마다 호출되는 ‘인스턴스 초기화 메서드’
//	생성자는 리턴타입이 없다
	public Constructor() {
		System.out.println("생성자입니다.");
	}
	
	public Constructor(int i) {
		System.out.println(i+"번째 생성자입니다");
	}

	public static void main(String[] args) {
		Constructor con = new Constructor();
		Constructor con1 = new Constructor(5);

	}

}
