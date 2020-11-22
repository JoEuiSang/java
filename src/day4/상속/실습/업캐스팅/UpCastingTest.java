package day4.상속.실습.업캐스팅;

public class UpCastingTest {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("안대혁");
		p = s;
		System.out.println(p.name);
//		p.setGrade("A");	//에러출력. 부모타입에서 자식타입 접근 불가
	}

}
