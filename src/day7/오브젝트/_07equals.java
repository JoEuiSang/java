package day7.오브젝트;

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
			System.out.println("같아요");
		} else {
			System.out.println(p1);
			System.out.println(p2);
			System.out.println("달라요");
		}

		if (p1.equals(p2)) {
			System.out.println(p1.getClass());
			System.out.println(p2.getClass());
			System.out.println("같아요1");
		} else {
			System.out.println("달라요1");
		}
	}

}
