package day9._01Generic;

class 방석{
	
}

public class GenericBoxUser {
	public static void main(String[] args) {
		GenericBox<Hanger> box = new GenericBox<Hanger>();
		box.setObj(new Hanger());

		GenericBox<방석> box2 = new GenericBox<방석>();
		box2.setObj(new 방석());
	}
}
