package day8._06�÷���;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	// Map:Ű�� ���� �������� ������ �ڷᱸ��
	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<String, Student>();
		students.put("���ǻ�", new Student("���ǻ�"));
		students.put("����", new Student("���ǻ�"));
		students.put("��", new Student("���ǻ�"));
		students.put("�ǻ�", new Student("���ǻ�"));
		students.put("����", new Student("���ǻ�"));
		System.out.println(students);

		System.out.println(students.get("��"));

		// �� ��ü ���
		// ���� Ű������ �¿� �����Ѵ�
		Set<String> keys = students.keySet();

		for (String key : keys) {
			System.out.println("key : " + key + ", " + " value : " + students.get(key));
		}

		//�̷������ε� ����
		for (Entry<String, Student> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());

		}
	}
}
