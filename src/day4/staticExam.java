package day4;

public class staticExam {
	String name;
	
	public void method() {
		System.out.println("�ν��Ͻ��� �־�� ��밡��");
	}
	
	public static void smethod() {
		System.out.println("�ν��Ͻ��� ��� ��밡�� ��� thisŰ���� ��� �Ұ�");
	}
	
	public static void main(String[] args) {
//		method(); ����
		smethod();
		
		staticExam se = new staticExam();
		se.method();
	}

}
