package day9._01Generic;

class Hanger {

}

public class BoxUser {

	public static void main(String[] args) {
		Box box = new Box();
		Hanger h1 = new Hanger();

		box.setObj(h1);

//		Hanger h2 = box.getObj();  //이러면 box의 멤버 타입이 object이기때문에 hanger에 담지 못한다
		Object h2 = box.getObj(); //

	}

}
