package day2;

import java.awt.Window.Type;

public class �迭���� {

	public static void main(String[] args) {
		for(String i:args) {
			System.out.println(i);
		}
		
		System.out.println(args[0]);
		
//		args �� ��� ���� ���ڿ��� ���´�. ������ ���� ���ڷ� ����
//		���������� ���ڸ� ����Ÿ������ ��ȯ�ϱ����ؼ��� ��ȯ�� ������Ѵ�
		
		//parseInt�� �̿��Ͽ� ����ȯ ����
		int a = Integer.parseInt(args[0]);
		
		System.out.println(a);
		
		int i1, i2, i3;
		

		i1 = 10;

		int[] arr; // �迭 ����
		arr = new int[3]; // �迭 ����

		// �迭�� ���̵� �ڵ� �������.
		int[] arr2 = new int[5];
		int arr3[] = new int[5];

		// �迭�� ũ�⸦ �����Ҽ�����.

		// �迭�� �� �ֱ�
		i1 = 10;
		arr[0] = 10;

		// �� ������
		i2 = arr[0];
		
		//������ ���ÿ� �ʱ�ȭ
		int[] iarr = {1,2,3,4,5};
		int[] iarr2= new int[] {1,2,3,4,5};  //������ ����
		for(int i: iarr) {
			System.out.println(i);
		}

	}

}
