package day8._02string.�ǽ�;

public class _04 {
	public static void main(String[] args) {
		String a = new String("abcd");
		String b = new String(",efg");

		// ���ڿ� ����
		a = a.concat(b);
		System.out.println(a);

		// ��������
		a = a.trim();
		System.out.println("---" + a + "---");

		// ���ڿ� ��ġ
		a = a.replace("ab", "12");
		System.out.println(a);

		// ���ڿ� �и�
		String s[] = a.split(",");
		for(String i : s) {
			System.out.println(i);
		}
		
		//���꽺Ʈ��
		a=a.substring(3);
		System.out.println(a);
		
		//���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);
		
	}
}
