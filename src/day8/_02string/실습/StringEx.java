package day8._02string.½Ç½À;

public class StringEx {
	public static String midStr(String s) {
		return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1)
				: s.charAt(s.length() / 2) + "";
	}

	public static String reverseString(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}

	public static String convertString(String s) {
		char arr[] = new char[s.length()];
		for(int i=0; i< s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				 arr[i] = (char) (s.charAt(i)-32);
			}else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				arr[i] = (char) (s.charAt(i)+32);
			}
		}
		
		return new String(arr);
	}

	public static void main(String[] args) {
		System.out.println(StringEx.midStr("abcd")); // bc
		System.out.println(StringEx.midStr("abcde")); // c
		System.out.println(StringEx.reverseString("abcdef")); // fedcba
		System.out.println(StringEx.convertString("aBcd")); // AbCD }
	}

}
