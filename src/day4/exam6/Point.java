package day4.exam6;

public class Point {
	private int x,y;
	private boolean visible=true;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x) {
		this(x,0);		
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void show() {
		System.out.printf("ÁÂÇ¥ [x = %d, y = %d]¿¡ Á¡À» ±×·È½À´Ï´Ù\n", getX(), getY());
	}
	
	public void show(boolean visible) {
		if(visible == false) {
			System.out.printf("ÁÂÇ¥ [x = %d, y = %d]¿¡ Á¡À» Áö¿ü½À´Ï´Ù\n", getX(), getY());
			setX(0);
			setY(0);	
		}
		else {
			show();
		}
		
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
		Point p1 = new Point();
		Point p2 = new Point(2);
		Point p3 = new Point(10,20);
		
		p1.show();
		p2.show();
		p3.show();
		p1.show(true);
		p2.show(true);
		p3.show(true);
	}
}
