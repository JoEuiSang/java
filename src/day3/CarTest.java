package day3;

public class CarTest {

	public static void main(String[] args) {
		int a;
		String strr;
		
		// 지역변수는 초기화하지 않으면 에러발생
		// 클래스변수, 인스턴스변수는 초기화하지 않아도 기본값으로 초기화가 된다.
		
		System.out.println(Car.numberOfCars);
		System.out.println(Car.str);
		
		Car car = new Car();	// 인스턴스화 할때 heap 메모리에 생성
		Car.numberOfCars++;

		car.name = "아우디";
		car.setName("아우디"); // 위와 아래가 같은 동작을 하지만, 보안적 요소에서 차이가있다.

		Car car2 = new Car();
		Car.numberOfCars++;
		car2.setName("제네시스"); // 위와 아래가 같은 동작을 하지만, 보안적 요소에서 차이가있다.

		Car car3 = new Car();
		Car.numberOfCars++;
		car3.setName("포르쉐"); // 위와 아래가 같은 동작을 하지만, 보안적 요소에서 차이가있다.
		
		System.out.println(Car.numberOfCars);
	
		
	}

}
