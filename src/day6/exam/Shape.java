package day6.exam;

public class Shape implements Drawable{
	private int x, y;
	private boolean visible = true;

	public Shape() {
		this(0, 0);
	}

	public Shape(int x) {
		this(x, 0);
	}

	public Shape(int x, int y) {
		setX(x);
		setY(y);
	}

	public void draw() {
		System.out.print("구체적인 도형을 그릴 수 없습니다. 상속해서 재정의하세요");
	}

	public void show() {
		System.out.printf("좌표 [x = %d, y = %d]에 점을 그렸습니다\n", getX(), getY());
	}

	public void show(boolean visible) {
		if (visible == false) {
			System.out.printf("좌표 [x = %d, y = %d]에 점을 지웠습니다\n", getX(), getY());
			setX(0);
			setY(0);
		} else {
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

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * public static void main(String[] args) { Shape p1 = new Shape(); Shape p2 =
	 * new Shape(2); Shape p3 = new Shape(10,20);
	 * 
	 * p1.show(); p2.show(); p3.show(); p1.show(true); p2.show(true); p3.show(true);
	 * }
	 */
}
