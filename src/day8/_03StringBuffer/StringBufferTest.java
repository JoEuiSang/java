package day8._03StringBuffer;

//��Ʈ�� ���� : ����ũ���� ���۸� ������
// ��Ʈ�� ��ü�� ������ �Ҽ�������, ��Ʈ�����۴� ������ �����ϴ�

public class StringBufferTest {
	public static void main(String[] args) {
		//��Ʈ�� ���� Ŭ���� ��ü ����
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" test hahaha");	//���ڿ� ���̱�
		System.out.println(sb);
		
		sb.insert(7, "my");			//���ڿ� ���� : �߰��� ����
		System.out.println(sb);
		
		sb.replace(9,14, "your");	//���ڿ� ġȯ, 9~13������ your�� ��ü
		System.out.println(sb);
		
		sb.setLength(10);			//���� ���̸� ������
		System.out.println(sb);
	}
}
