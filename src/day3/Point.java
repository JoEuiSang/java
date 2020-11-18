package day3;

public class Point {
	private int x,y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void show() {
		System.out.printf("ÁÂÇ¥ [x = %d, y = %d]¿¡ Á¡À» ±×·È½À´Ï´Ù\n", getX(), getY());
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



	public static void main(String[] args) {
		Point p1 = new Point(2,5);
		Point p2 = new Point(10,30);
		
		p1.show();
		p2.show();

	}

}
