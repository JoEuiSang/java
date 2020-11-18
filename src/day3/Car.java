package day3;

public class Car {
//	클래스의 속성 - 필드
	String name;
	int speed;
	static int numberOfCars;
	static String str;
//	엔진 e;
	
	
//	클래스의 기능, 행위 - 메소드
//	getter, setter 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
