package day9._01Generic;

class �漮{
	
}

public class GenericBoxUser {
	public static void main(String[] args) {
		GenericBox<Hanger> box = new GenericBox<Hanger>();
		box.setObj(new Hanger());

		GenericBox<�漮> box2 = new GenericBox<�漮>();
		box2.setObj(new �漮());
	}
}
