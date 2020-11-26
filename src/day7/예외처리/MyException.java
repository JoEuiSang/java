package day7.예외처리;

public class MyException extends Exception{
	public MyException() {
		super("score에는 0~100 사이의 값만 들어갈 수 있습니다.");
	}
	
	public MyException(String msg) {
		super(msg);
	}

}
