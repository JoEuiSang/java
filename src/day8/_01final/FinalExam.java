package day8._01final;

//final class : 상속불가
//final method : 오버라이드 불가
//final variable : 수정 불가

final class FinalParent{
	 final public void method1() {		//자식클래스에서도 오버라이드 불가
		
	}
}

/*
public class FinalExam extends FinalParent{	//상속에러
	final int WORD_EXAM = 10;	
	
	
	@Override
	public void method1() {				//재정의 에러
		// TODO Auto-generated method stub
		super.method1();
	}
*/

//
//	public static void main(String[] args) {
//		FinalExam f = new FinalExam();
//	}
//	
//}
