package javaExam;

public class Exam02 {

	public static void main(String[] args) {
		// ����ȯ
		int i = 20;
		long cup = i;
		
		i = (int)cup; //����ȯ, Ÿ��ĳ����
		
		float f = 11.1f;
		
//		cup = f; ���� ��� �Ǽ��� , ������ ����
		
		
		cup = (long)f; //
		System.out.println(cup);

	}

}
