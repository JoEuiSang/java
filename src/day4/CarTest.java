package day4;

public class CarTest {

	public static void main(String[] args) {
		Car mcqueen = new Car();
		System.out.println(Car.numberOfCars +"대의 차가 생산되었습니다.");
		Car hudson = new Car("허드슨");
		Car marter = new Car("마터",200);
		System.out.println(Car.numberOfCars +"대의 차가 생산되었습니다.");
		
		mcqueen.printInfo();
		hudson.printInfo();
		marter.printInfo();
	}

}
