package day4.���.�ǽ�.colorPoint;

public class ColorPoint extends Shape{
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void show() {
		System.out.printf("��ǥ [x = %d, y = %d, color=%s]�� ���� �׷Ƚ��ϴ�\n", getX(), getY(),color);
	}
	
}
