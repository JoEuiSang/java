package day4.���;

class Parent {

	int i = 5;

	public int getI() {
		return i;
	}
}

class Child extends Parent {
	int i = 10; // ������ , �������̵�
	int j = 50;

	public int getI() {
		return i;
	}

}

//��� : �θ� �������� �ڽ��� �����޴°�
public class ��� {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.i);

		Child c = new Child();
		System.out.println(c.i);

		// �θ�� �ڽ��� ����ų �� �ִ�. ������ �ڼ��� ����ų �� �ִ�. (�ڽİ�ü�� �θ��� Ÿ������ �ؼ��ߴ�)
		Parent p2 = new Child();	//�θ��� �ʵ�,�޼���� �����ȴ�
		
		// �ʵ�� �������̵� �Ǹ� Ÿ���� ������!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(p2.i);
		
		//!@#!@#!@# ���� �ٽ� ���� !@#!@#!@#!
		// �޼���� �������̵� �Ǹ� ������ �ڽĲ� ����!@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(p2.getI());

		// �ڽ��� �θ� ����ų �� ����.
//		Child c2 = new Parent();  ����

	}
}
