package day7.실습.equals오바라이드;

public class LangClassTest {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);

		if (a.equals(b))
			System.out.println("a b는 같다");
		if (a.equals(c))
			System.out.println("a c는 같다");
		if (c.equals(b))
			System.out.println("b c는 같다");

		Circle d = new Circle(4, 10);
		Circle e = new Circle(10, 4);
		Circle f = new Circle(6, 12);
		
		if (d.equals(e))
			System.out.println("d e 같다");
		if (d.equals(f))
			System.out.println("d f 같다");
		if (e.equals(f))
			System.out.println("e f 는 같다");

	}
}