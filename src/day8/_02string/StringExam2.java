package day8._02string;

public class StringExam2 {
	public static void main(String[] args) {
		String greet = "Hello java!!!";
		
		System.out.println(greet.charAt(6));	//�� ����
		
		greet.substring(4);		//4�� ���ķ� ¥��
		
		System.out.println(greet); //������ ���ڿ��� �ٲ��� �ʾҴ�
		
		greet = greet.substring(4);	//�̷��� ����� ���Ӱ� ������� �ָ� ����Ų��
		
		System.out.println(greet);
	}
}
