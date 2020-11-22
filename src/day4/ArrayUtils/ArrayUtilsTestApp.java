package day4.ArrayUtils;

public class ArrayUtilsTestApp {

	public static void main(String[] args) {
		//인자로 넘길 배열 임의로 선언
		int[] intArr1 = { 1, 2, 3, 4, 5 };
		int[] intArr2 = { 6, 7, 8, 9, 10 };
		
//		ArrayUtils au = new ArrayUtils();

		//합쳐진 배열을 받을 변수
		int[] concateArr;
		
//		concateArr = au.concate(intArr1, intArr2);
		concateArr = ArrayUtils.concate(intArr1, intArr2);
		
		System.out.println("합친거");
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
