package day8._06컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	// Map:키와 값의 묶음으로 구성된 자료구조
	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<String, Student>();
		students.put("조의상", new Student("조의상"));
		students.put("조의", new Student("조의상"));
		students.put("조", new Student("조의상"));
		students.put("의상", new Student("조의상"));
		students.put("조상", new Student("조의상"));
		System.out.println(students);

		System.out.println(students.get("조"));

		// 맵 전체 출력
		// 맵의 키값들을 셋에 저장한다
		Set<String> keys = students.keySet();

		for (String key : keys) {
			System.out.println("key : " + key + ", " + " value : " + students.get(key));
		}

		//이런식으로도 가능
		for (Entry<String, Student> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());

		}
	}
}
