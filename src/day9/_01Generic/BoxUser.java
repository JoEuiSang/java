package day9._01Generic;

class Hanger {

}

public class BoxUser {

	public static void main(String[] args) {
		Box box = new Box();
		Hanger h1 = new Hanger();

		box.setObj(h1);

//		Hanger h2 = box.getObj();  //�̷��� box�� ��� Ÿ���� object�̱⶧���� hanger�� ���� ���Ѵ�
		Object h2 = box.getObj(); //

	}

}
