package day4.ArrayUtils;

public class ArrayUtilsTestApp {

	public static void main(String[] args) {
		//���ڷ� �ѱ� �迭 ���Ƿ� ����
		int[] intArr1 = { 1, 2, 3, 4, 5 };
		int[] intArr2 = { 6, 7, 8, 9, 10 };
		
//		ArrayUtils au = new ArrayUtils();

		//������ �迭�� ���� ����
		int[] concateArr;
		
//		concateArr = au.concate(intArr1, intArr2);
		concateArr = ArrayUtils.concate(intArr1, intArr2);
		
		System.out.println("��ģ��");
		for(int val:concateArr) {
			System.out.print(val+", ");	
		}
		
		System.out.println();
		
		double[] doubleArr;
		
		doubleArr = ArrayUtils.intToDouble(concateArr);
		
		System.out.println("int >> double");
		for(double val:doubleArr) {
			System.out.print(val+", ");	
		}

		System.out.println();
		
		int[] intArr;
		
		intArr = ArrayUtils.doubleToInt(doubleArr);
		
		System.out.println("double >> int");
		for(int val:intArr) {
			System.out.print(val+", ");	
		}
	}
}
