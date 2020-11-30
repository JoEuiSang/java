package day10._01StringExam;

import java.util.StringTokenizer;

public class StringExam {
	
	public static void main(String[] args) {
		//���ڿ� �����ϱ�
		String str = "���ǻ� : 1111 : 50000";
		
		//split(������) : ��Ʈ���� �����ڷ� �����Ͽ� �迭�� ��ȯ���ش�
		String[] strArr = str.split(":");
		
		for(String string: strArr) {
			//trim() : ��Ʈ���� �յ� ������ �����ش�,, �߰������� �״��
			System.out.println(string.trim());
		}
		
		//���������� ��ȯ
		int money = Integer.parseInt(strArr[2]);
		
		System.out.println(money);
		
		//���ڿ��� �����ڷ� �����Ͽ� ��ū���·� ��ȯ���ش�
		StringTokenizer st = new StringTokenizer(str,",");
		//hasMoreElements(): ��ū�� �����ִ��� Ȯ��
		while(st.hasMoreElements()) {
			//nextElement(): ������ū ��ȯ
			System.out.println(st.nextElement());
		}
		
	}
}
