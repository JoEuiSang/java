package day7.예외처리;

public class _04위험요소가있는메소드 {
//	– Checked Exception : 컴파일 할 때 확인 되는 예외로 예외처리가 필요함
//	– Unchecked Exception : 실행시점에 확인되는 예외로 예외처리를 하지 않아도 컴파일 됨

	public static void m1(int[] iarr) throws Exception {	//에러가 날 수 있으니 무조건 예외처리를 하라는 의미
		System.out.println(iarr[2]);
	}

	public static void m2(int[] iarr) throws RuntimeException {
		System.out.println(iarr[2]);
	}

	public static void main(String[] args) {
		int[] iarr = new int[5];

		try {
			m1(iarr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m2(iarr);
	}
}
