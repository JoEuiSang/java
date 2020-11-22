package day4.상속.실습.업캐스팅;

public class DownCastingTest {
	public static void main(String[] args) {
		Person p = new Student("안대혁");
		Student s;
		s = (Student) p;
		System.out.println(s.getName());
		s.setGrade("A");
	}
}
