package day6;

public interface InterA {
	static int j = 20;
	int i = 10;		//�������̽��� ��������� ������ ���� ������ �ڵ����� ����ƽ ������ �����
	
	//����Ʈ �޼���, �⺻������ ���ǵ� �Լ�, �������̵� ����
	public default void optionMethod() {
		System.out.println("DB�� �����ϴ� �⺻���� ����!!");
	}
	
	//����ƽ �޼���, ���� �� ���� ���� ��� ����
	public static void interAStatic() {
		System.out.println("��������");
	}
}
