package day2;

public class �ݺ��� {

	public static void main(String[] args) {
		/*
		 * for (�ʱⰪ, ����, ������){
		 * 
		 * }
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 1~100���� ¦���� �� ���ϱ�
		int sum =0;
		
		for(int i =1 ; i<1001; i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~1000���� ¦���� �� : "+sum);
		
		PlusMachine pm = new PlusMachine();
		System.out.println("¦���� "+pm.evenSum(500));
		System.out.println("Ȧ���� "+pm.oddSum(500));
		

	}

}
