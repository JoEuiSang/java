package day4.»ó¼Ó;



public class Student extends Person {

	public void set() {
		age = 30;
		name = "È«±æµ¿";
		height = 175;
		setHeight(99);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		
		System.out.println(s.name);

	}

}


class Person {
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public void setHeight(int height) {
		this.height = height;
	}
}