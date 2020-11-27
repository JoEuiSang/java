package day8._06컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;



public class ArrayListTest {
	public static void main(String[] args) {
		// 배열과 어레이리스트의 가장 큰 차이 : 길이수정 가능유무
		
		//선언 <제네릭> : 선언된 타입만 들어갈수있게 제한함 
		ArrayList<String> list = new ArrayList<String>();
		
		//삽입
		list.add("Jo");		
		list.add("Eui");
		list.add("Sang");
		
		//삽입된 값 개수
		System.out.println(list.size());
		
		//사용
		System.out.println(list.get(0));
		
		//수정
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
		
		students.add(new Student("조의상"));
		students.add(new Student("김기도"));
		students.add(new Student("황호연"));
		
		System.out.println(students);
		
		System.out.println(list.contains("Sang"));
		System.out.println(students.contains(new Student("조의상")));		
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
