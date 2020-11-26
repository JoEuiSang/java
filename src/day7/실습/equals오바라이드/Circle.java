package day7.�ǽ�.equals���ٶ��̵�;

public class Circle {
	int x, y, radius;

	public Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.radius = x < y ? y - x : x - y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			if(this.radius == ((Circle)obj).radius) {
				return true;
			}
		}
		return false;
	}
	
	

}
