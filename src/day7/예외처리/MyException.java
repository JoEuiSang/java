package day7.����ó��;

public class MyException extends Exception{
	public MyException() {
		super("score���� 0~100 ������ ���� �� �� �ֽ��ϴ�.");
	}
	
	public MyException(String msg) {
		super(msg);
	}

}
