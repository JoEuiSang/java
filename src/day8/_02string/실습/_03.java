package day8._02string.�ǽ�;

public class _03 {

	public static void main(String[] args) {
		/*
		1) ��aBcAbCabcABC�� ���ڿ� String ��ü�� �����Ѵ�.
	 	2) 3��° ���ڿ� ����Ѵ�,
	 	3) ��abc�����ڿ��� ó������ ��Ÿ���� �ε����� �����Ѵ�.
	 	4) �� ���ڿ��� ���� ������ ����Ѵ�.
	 	5) ��a���� ��R���� ��ü�� ����� ����Ѵ�. 
		6) ��abc�����ڿ��� ��123�����ڿ��� ��ü�� ����� ����Ѵ�.
	 	7) ó�� 3���� ���ڿ����� ����Ѵ�.
	 	8) ���ڿ��� ��� �빮�ڷ� �����Ͽ� ����Ѵ�
	 */
		//1
		String abc = new String("aBcAbCabcABC");
		//2
		System.out.println(abc.charAt(3));
		//3
		System.out.println(abc.indexOf("abc"));		
		//4
		System.out.println(abc.length());
		//5
		System.out.println(abc.replace("a", "R"));
		//6
		System.out.println(abc.replace("abc", "123"));
		//7
		System.out.println(abc.substring(0,3));
		//8
		System.out.println(abc.toUpperCase());
	}
}
