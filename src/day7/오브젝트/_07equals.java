package day7.������Ʈ;

class Pen {

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() == obj.getClass()) {
			return true;
		}
			return false;
	}

}

public class _07equals {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new Pen();

		if (p1 == p2) {
			System.out.println("���ƿ�");
		} else {
			System.out.println(p1);
			System.out.println(p2);
			System.out.println("�޶��");
		}

		if (p1.equals(p2)) {
			System.out.println(p1.getClass());
			System.out.println(p2.getClass());
			System.out.println("���ƿ�1");
		} else {
			System.out.println("�޶��1");
		}
	}

}
