package day7.�ǽ�.equals���ٶ��̵�;

public class LangClassTest {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);

		if (a.equals(b))
			System.out.println("a b�� ����");
		if (a.equals(c))
			System.out.println("a c�� ����");
		if (c.equals(b))
			System.out.println("b c�� ����");

		Circle d = new Circle(4, 10);
		Circle e = new Circle(10, 4);
		Circle f = new Circle(6, 12);
		
		if (d.equals(e))
			System.out.println("d e ����");
		if (d.equals(f))
			System.out.println("d f ����");
		if (e.equals(f))
			System.out.println("e f �� ����");

	}
}