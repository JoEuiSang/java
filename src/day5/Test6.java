package day5;

class Parent6 {
	int i = 5;

	public int get() {
		return i;
	}
}

class Child6 extends Parent6 {
	int i = 10;

	public int get() {
		return i;
	}

	public void print() {
		System.out.println(i);
	}
}

public class Test6 {

	public static Parent6 getObject(int i) {
		if (i > 0)
			return new Parent6();
		else
			return new Child6();
	}

	public static void main(String[] args) {
		//Parent6 p6 = getObject(1); // new Parent();
		 Parent6 p6 = getObject(-1); // new Child();
		System.out.println(p6.i);
		System.out.println(p6.get());

		if (p6 instanceof Child6) {
			Child6 c6 = (Child6) p6;
			System.out.println(c6.i);
			System.out.println(c6.get());
		}
	}

}
