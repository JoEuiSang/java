package day8._05기본API.date;

import java.util.Calendar;
//날짜와 시간에 관한 정보를 표현
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDay());  // 취소선 : 곧 사라질 수도 있다는 의미
		System.out.println(d.getMonth()); //0월부터 시작한다..
		
		
		//데이트 클래스를 대체할 캘린더 클래스
		Calendar c = Calendar.getInstance();	//이런식으로도 객체생성이 가능
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.DATE));
		
	}
	
	
	
	
}
