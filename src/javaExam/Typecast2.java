package javaExam;

public class Typecast2 {

	public static void main(String[] args) {
		byte b; 
		int i = 414;
		float f = 123.456f;
		
		b = (byte)i;
		System.out.println("int"+i+"�� byte �� ��ȯ :"+b);
		i = (int)f;
		System.out.println("float"+f+"�� int �� ��ȯ :"+i);
		b=(byte)f;
		System.out.println("float"+f+"�� byte �� ��ȯ :"+b);
		

	}

}
