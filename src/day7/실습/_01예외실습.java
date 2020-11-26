package day7.실습;

public class _01예외실습 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		for (int i = 0; i < 5; i++) {
			try{
				intArray[i + 1] = i + 1 + intArray[i]; // i=4인 경우 예외 발생
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);	
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
