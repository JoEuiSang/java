package day3;

public class Constructor { 
 
//	Ŭ������ �̸��� �Ȱ���, �����ε� ����
//	�⺻ ������, ������ �ȵǾ� �ִ��� �����ϰ������� �ڵ� ����
//	�ν��Ͻ��� ������ ������ ȣ��Ǵ� ���ν��Ͻ� �ʱ�ȭ �޼��塯
//	�����ڴ� ����Ÿ���� ����
	public Constructor() {
		System.out.println("�������Դϴ�.");
	}
	
	public Constructor(int i) {
		System.out.println(i+"��° �������Դϴ�");
	}

	public static void main(String[] args) {
		Constructor con = new Constructor();
		Constructor con1 = new Constructor(5);

	}

}
