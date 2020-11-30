package day10._01StringExam;

import java.util.StringTokenizer;

public class StringExam {
	
	public static void main(String[] args) {
		//문자열 정제하기
		String str = "조의상 : 1111 : 50000";
		
		//split(구분자) : 스트링을 구분자로 구분하여 배열로 반환해준다
		String[] strArr = str.split(":");
		
		for(String string: strArr) {
			//trim() : 스트링의 앞뒤 공백을 지워준다,, 중간공백은 그대로
			System.out.println(string.trim());
		}
		
		//정수형으로 변환
		int money = Integer.parseInt(strArr[2]);
		
		System.out.println(money);
		
		//문자열을 구분자로 구분하여 토큰형태로 반환해준다
		StringTokenizer st = new StringTokenizer(str,",");
		//hasMoreElements(): 토큰이 남아있는지 확인
		while(st.hasMoreElements()) {
			//nextElement(): 다음토큰 반환
			System.out.println(st.nextElement());
		}
		
	}
}
