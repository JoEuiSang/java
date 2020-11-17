package day2;

public class ArrayUtil {
	//배열을 비교하는 메소드
	public static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}else {
			for(int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
