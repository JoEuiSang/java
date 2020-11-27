package day8._03StringBuffer;

//스트링 버퍼 : 가변크기의 버퍼를 가진다
// 스트링 객체는 수정을 할수없지만, 스트링버퍼는 수정이 가능하다

public class StringBufferTest {
	public static void main(String[] args) {
		//스트링 버퍼 클래스 객체 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" test hahaha");	//문자열 붙이기
		System.out.println(sb);
		
		sb.insert(7, "my");			//문자열 삽입 : 중간에 들어간다
		System.out.println(sb);
		
		sb.replace(9,14, "your");	//문자열 치환, 9~13까지를 your로 대체
		System.out.println(sb);
		
		sb.setLength(10);			//버퍼 길이를 제한함
		System.out.println(sb);
	}
}
