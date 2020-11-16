/*예약어 : package, public, class 등등 이미 정해져있는 약속된 단어
*/

//패키지 : 관련있는 클래스끼리 묶어놓은 것
package javaExam;

//public, protected, private : 접근제한자,     생략되었다면 기본 패키지영역 
// 공용     ,   상속관계    ,  본인만
public class HelloWorld {

	public static void main(String[] args) {  
	//기본 클래스들 String, System, 등등은 java.lang 패키지 안에 있고 이 패키지는 선언하지 않아도 기본 임포트 되어있다.
		System.out.println("hello");
		// '객체.' 은 객체 안에 있는 이라는 뜻, 뒤에 ()가 없으면 필드라는 뜻
		//System.out 은 콘솔을 의미한다
	}
}

// new 키워드 : 객체 인스턴스화, 사용하도록 선언, 메모리에 올림,
// 가비지 컬렉터 : 메모리를 관리해주는 

class Book{
	
}