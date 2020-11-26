package day7.�ǽ�.equals���ٶ��̵�;

public class Rect {
	int width, height;
	int area;

	Rect(int x, int y) {
		area = x * y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rect) {
			if (this.area == ((Rect) obj).area) {
				return true;
			}
		}
		return false;
	}
}
