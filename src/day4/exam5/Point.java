package day4.exam5;

public class Point {
	private int x,y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x) {
		this(x,0);		
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
		System.out.printf("�� ����");
	}
	
	public void show() {
		System.out.printf("��ǥ [x = %d, y = %d]�� ���� �׷Ƚ��ϴ�\n", getX(), getY());
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	public static void main(String[] args) {
//		Point p1 = new Point();
//		Point p2 = new Point(2);
//		Point p3 = new Point(10,20);
//		
//		p1.show();
//		p2.show();
//		p3.show();
//	}
}
