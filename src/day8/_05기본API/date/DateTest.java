package day8._05�⺻API.date;

import java.util.Calendar;
//��¥�� �ð��� ���� ������ ǥ��
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDay());  // ��Ҽ� : �� ����� ���� �ִٴ� �ǹ�
		System.out.println(d.getMonth()); //0������ �����Ѵ�..
		
		
		//����Ʈ Ŭ������ ��ü�� Ķ���� Ŭ����
		Calendar c = Calendar.getInstance();	//�̷������ε� ��ü������ ����
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.DATE));
		
	}
	
	
	
	
}
