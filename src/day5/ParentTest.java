package day5;
class Parent{
	private int i;
	public Parent() {
		System.out.println("Parent () 생성자");
	}
	public Parent(int i) {
		this.i = i;
		System.out.println("parent int i  생성자!! ");
	}
	
	public int getI() {
		return i;
	}
	public void testMethod() {
		System.out.println(i);
	}
	public static void staticMethod() {
	//	System.out.println(i);
	}
}

class Child extends Parent{
	private int j;
	public Child(){
		
		System.out.println("Child () 생성자");
	}
	public Child(int i) {
		super(i);
		
		System.out.println("Child int i  생성자!! ");
	}
	public Child(int i, int j, String str) {
		
	}
	
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j= j;
	}
}
public class ParentTest {

	public static void main(String[] args) {
//		Child  c = new Child();
		
		Child c2 = new Child(10);
		
		Parent p;
		Child c = new Child();
		p = c;
		
//		System.out.println(p.i);
		System.out.println(p.getI());
		
		//p.getJ();   getJ()는 child가 가진 메소드이므로 부모타입으로 접근 할 수 없다.  사용하려면 child로 형변환 해야함.
//
	}

}
