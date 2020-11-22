package day4.상속.실습.colorPoint;

public class ShapeTest {

	public static void main(String[] args) {
		Shape a, b;

		a = new Shape(2, 3);
		b = new ColorPoint(3, 4, "red");
		a.show();
		b.show();

		Shape rect = new Rect();
		Shape circle = new Circle();
		rect.draw();
		circle.draw();

	}

}
