package day5;
class Parent{
	private int i;
	public Parent() {
		System.out.println("Parent () ������");
	}
	public Parent(int i) {
		this.i = i;
		System.out.println("parent int i  ������!! ");
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
		
		System.out.println("Child () ������");
	}
	public Child(int i) {
		super(i);
		
		System.out.println("Child int i  ������!! ");
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
		
		//p.getJ();   getJ()�� child�� ���� �޼ҵ��̹Ƿ� �θ�Ÿ������ ���� �� �� ����.  ����Ϸ��� child�� ����ȯ �ؾ���.
//
	}

}
