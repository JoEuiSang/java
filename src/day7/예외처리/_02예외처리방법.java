package day7.예외처리;

public class _02예외처리방법 {
	public static void main(String[] args) {
		int a = 1;
		double b = 0;

		int[] iarr = new int[1];

		try {// 예외가 날 것 같은 부분을 try 블록 안에 구현
			b = 100 / a; 
			iarr[1] = 10;
		} catch (ArithmeticException e) {	//ArithmeticException에 대한 처리
			System.out.println("Exception occurred : " + e);
			a = 1;
			b = 100 / a;
		} 		
		catch (ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException에 대한 처리
			e.printStackTrace();
		} 
		catch (Exception e) {		//위에서 잡아준 예외 제외 모든 예외에대하여 처리
			e.printStackTrace();
		}
		finally {	//예외가 나던 안나던 실행하는 구문
			System.out.println("나는 항상 실행돼");
		}

		System.out.println(b);

	}
}
