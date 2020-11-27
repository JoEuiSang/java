package day8._02string;

public class StringExam {
	public static void main(String[] args) {
		//2가지 방식으로 string 정의 가능
		String str1 = "test";
		String str2 = new String("test");
		String str3 = "test";
		String str4 = new String("test");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {	//서로 다른 참조값을 가지기때문에 다르다
			System.out.println("같다");
		}else {
			System.out.println("다름");	//출력
		}
		
		if(str1 == str3) {	// 문자열을 스트링영역 메모리에 저장하여 바라보게한다(같다)
			// 이러한 이유로 스트링이 수정되면 해당 메모리의 내용이 수정되는것이 아니라 새로운 메모리에 수정한 문자열로 새롭게 저장된다, 그 메모리를 바라보게함
			// 스트링은 불변클래스
			//
			System.out.println("같다");	//출력
		}else {
			System.out.println("다름");	
		}
		
		if(str2 == str4) {	// 객체로 생성을 하면 새로운 메모리 생성(다르다)
			System.out.println("같다");	
		}else {
			System.out.println("다름");	//출력
		}
		
	}
}
