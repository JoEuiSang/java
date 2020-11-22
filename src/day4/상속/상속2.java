package day4.상속;

class Book{
	
}


public class 상속2 {
	public static void 클럽(Child c) {

	}

	public static void 음식점(Parent p) {

	}

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		음식점(p);
		음식점(c);
		Book b = new Book();
		
//		클럽(p); 에러출력
		클럽(c);

	}

}
