package javaExam;

public class Typecast2 {

	public static void main(String[] args) {
		byte b; 
		int i = 414;
		float f = 123.456f;
		
		b = (byte)i;
		System.out.println("int"+i+"를 byte 로 변환 :"+b);
		i = (int)f;
		System.out.println("float"+f+"를 int 로 변환 :"+i);
		b=(byte)f;
		System.out.println("float"+f+"를 byte 로 변환 :"+b);
		

	}

}
