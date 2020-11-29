package day9._01Generic;

class 规籍{
	
}

public class GenericBoxUser {
	public static void main(String[] args) {
		GenericBox<Hanger> box = new GenericBox<Hanger>();
		box.setObj(new Hanger());

		GenericBox<规籍> box2 = new GenericBox<规籍>();
		box2.setObj(new 规籍());
	}
}
