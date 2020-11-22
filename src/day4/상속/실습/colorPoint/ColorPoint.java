package day4.상속.실습.colorPoint;

public class ColorPoint extends Shape{
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void show() {
		System.out.printf("좌표 [x = %d, y = %d, color=%s]에 점을 그렸습니다\n", getX(), getY(),color);
	}
	
}
