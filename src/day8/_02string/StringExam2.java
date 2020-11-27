package day8._02string;

public class StringExam2 {
	public static void main(String[] args) {
		String greet = "Hello java!!!";
		
		System.out.println(greet.charAt(6));	//각 시작
		
		greet.substring(4);		//4번 이후로 짜름
		
		System.out.println(greet); //하지만 문자열이 바뀌지 않았다
		
		greet = greet.substring(4);	//이렇게 해줘야 새롭게 만들어진 애를 가르킨다
		
		System.out.println(greet);
	}
}
