package day4;

public class staticExam {
	String name;
	
	public void method() {
		System.out.println("인스턴스가 있어야 사용가능");
	}
	
	public static void smethod() {
		System.out.println("인스턴스가 없어도 사용가능 대신 this키워드 사용 불가");
	}
	
	public static void main(String[] args) {
//		method(); 에러
		smethod();
		
		staticExam se = new staticExam();
		se.method();
	}

}
