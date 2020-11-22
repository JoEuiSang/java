package day4.상속;

class Parent {

	int i = 5;

	public int getI() {
		return i;
	}
}

class Child extends Parent {
	int i = 10; // 재정의 , 오버라이드
	int j = 50;

	public int getI() {
		return i;
	}

}

//상속 : 부모가 가진것을 자식이 물려받는것
public class 상속 {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.i);

		Child c = new Child();
		System.out.println(c.i);

		// 부모는 자식을 가리킬 수 있다. 조상은 자손을 가리킬 수 있다. (자식객체를 부모의 타입으로 해석했다)
		Parent p2 = new Child();	//부모의 필드,메서드로 생성된다
		
		// 필드는 오버라이드 되면 타입을 따른다!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(p2.i);
		
		//!@#!@#!@# 가장 핵심 개념 !@#!@#!@#!
		// 메서드는 오버라이드 되면 무조건 자식꺼 쓴다!@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(p2.getI());

		// 자식은 부모를 가리킬 수 없다.
//		Child c2 = new Parent();  에러

	}
}
