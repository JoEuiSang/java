package day8._06�÷���;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;



public class ArrayListTest {
	public static void main(String[] args) {
		// �迭�� ��̸���Ʈ�� ���� ū ���� : ���̼��� ��������
		
		//���� <���׸�> : ����� Ÿ�Ը� �����ְ� ������ 
		ArrayList<String> list = new ArrayList<String>();
		
		//����
		list.add("Jo");		
		list.add("Eui");
		list.add("Sang");
		
		//���Ե� �� ����
		System.out.println(list.size());
		
		//���
		System.out.println(list.get(0));
		
		//����
		list.set(0, "jjjjo");
		System.out.println(list.get(0));
		
		for(String i: list) {
			System.out.println(i);
		}				
		
		
		Vector<String> v = new Vector<String>();
		v.add("jo");
		v.add("eui");
		v.add("sang");
		
		System.out.println(v.get(0));
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("���ǻ�"));
		students.add(new Student("��⵵"));
		students.add(new Student("Ȳȣ��"));
		
		System.out.println(students);
		
		System.out.println(list.contains("Sang"));
		System.out.println(students.contains(new Student("���ǻ�")));		
	}
}

class Student{
	String name;

	public Student(String name) {	
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
