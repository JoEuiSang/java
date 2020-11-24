package day6.exam;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		Shape s = c;
		Drawable d = c;
		System.out.println(s.calculateArea());
		d.draw();
	}
}