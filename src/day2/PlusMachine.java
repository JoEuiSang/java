package day2;

public class PlusMachine {
	//�޼��� : ����������, ����Ÿ��
	
	public int plus(int a, int b) {
		return a+b;
	}
	
	//¦�� ���ϴ� �Լ�
	public int evenSum(int number) {
		int sum =0;
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	//Ȧ�� ���ϴ� �Լ�
		public int oddSum(int number) {
			int sum =0;
			for(int i=1; i<=number; i++) {
				if(i%2==1) {
					sum+=i;
				}
			}
			return sum;
		}
	
}
