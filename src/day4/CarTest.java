package day4;

public class CarTest {

	public static void main(String[] args) {
		Car mcqueen = new Car();
		System.out.println(Car.numberOfCars +"���� ���� ����Ǿ����ϴ�.");
		Car hudson = new Car("��彼");
		Car marter = new Car("����",200);
		System.out.println(Car.numberOfCars +"���� ���� ����Ǿ����ϴ�.");
		
		mcqueen.printInfo();
		hudson.printInfo();
		marter.printInfo();
	}

}
