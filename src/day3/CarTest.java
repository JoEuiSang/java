package day3;

public class CarTest {

	public static void main(String[] args) {
		int a;
		String strr;
		
		// ���������� �ʱ�ȭ���� ������ �����߻�
		// Ŭ��������, �ν��Ͻ������� �ʱ�ȭ���� �ʾƵ� �⺻������ �ʱ�ȭ�� �ȴ�.
		
		System.out.println(Car.numberOfCars);
		System.out.println(Car.str);
		
		Car car = new Car();	// �ν��Ͻ�ȭ �Ҷ� heap �޸𸮿� ����
		Car.numberOfCars++;

		car.name = "�ƿ��";
		car.setName("�ƿ��"); // ���� �Ʒ��� ���� ������ ������, ������ ��ҿ��� ���̰��ִ�.

		Car car2 = new Car();
		Car.numberOfCars++;
		car2.setName("���׽ý�"); // ���� �Ʒ��� ���� ������ ������, ������ ��ҿ��� ���̰��ִ�.

		Car car3 = new Car();
		Car.numberOfCars++;
		car3.setName("������"); // ���� �Ʒ��� ���� ������ ������, ������ ��ҿ��� ���̰��ִ�.
		
		System.out.println(Car.numberOfCars);
	
		
	}

}
