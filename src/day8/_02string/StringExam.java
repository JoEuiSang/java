package day8._02string;

public class StringExam {
	public static void main(String[] args) {
		//2���� ������� string ���� ����
		String str1 = "test";
		String str2 = new String("test");
		String str3 = "test";
		String str4 = new String("test");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {	//���� �ٸ� �������� �����⶧���� �ٸ���
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");	//���
		}
		
		if(str1 == str3) {	// ���ڿ��� ��Ʈ������ �޸𸮿� �����Ͽ� �ٶ󺸰��Ѵ�(����)
			// �̷��� ������ ��Ʈ���� �����Ǹ� �ش� �޸��� ������ �����Ǵ°��� �ƴ϶� ���ο� �޸𸮿� ������ ���ڿ��� ���Ӱ� ����ȴ�, �� �޸𸮸� �ٶ󺸰���
			// ��Ʈ���� �Һ�Ŭ����
			//
			System.out.println("����");	//���
		}else {
			System.out.println("�ٸ�");	
		}
		
		if(str2 == str4) {	// ��ü�� ������ �ϸ� ���ο� �޸� ����(�ٸ���)
			System.out.println("����");	
		}else {
			System.out.println("�ٸ�");	//���
		}
		
	}
}
