package day4.���.�ǽ�.��ĳ����;

public class DownCastingTest {
	public static void main(String[] args) {
		Person p = new Student("�ȴ���");
		Student s;
		s = (Student) p;
		System.out.println(s.getName());
		s.setGrade("A");
	}
}
