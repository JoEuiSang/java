package day4;

public class Car {
	String name;
	int speed;
	static int numberOfCars;
	
	public Car(String name) {
		this();
		this.name = name;
		speed = 0;
		
	}
	
	public Car(String name, int speed) {
		this(name);
		this.speed = speed;
	}
	
	public Car() {
		numberOfCars++;
	}

	public void printInfo() {
		System.out.println("차 종 : " + this.name);
		System.out.println("스피드 : " + this.speed);
		System.out.println();		
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
