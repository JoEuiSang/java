package day4.ArrayUtils;

public class ArrayUtils {
	// int -> double
	static double[] intToDouble(int[] source) {
		double[] result = new double[source.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = source[i];
		}

		return result;

	}

	// double -> int
	static int[] doubleToInt(double[] source) {
		int[] result = new int[source.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = (int) source[i];
		}

		return result;

	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int[] concate(int[] s1, int[] s2) {
		int[] result = new int[s1.length + s2.length];

		System.out.println(result.length);
		
		for (int i = 0; i < result.length; i++) {
			if (i < s1.length) {
				result[i] = s1[i];
			} else {
				result[i] = s2[i-s1.length];
			}
		}

		return result;
	}
}
