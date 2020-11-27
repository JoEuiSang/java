package day8._05기본API.date;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar caledar = Calendar.getInstance();
		// 지금!
		printDate(caledar);
		// 년도를 2013년으로 설정
		caledar.set(Calendar.YEAR, 2013);
		printDate(caledar);
		// 년,월,일을 설정함(2013-6-12), 월은 0부터 시작하므로 -1을 해줘야한다.
		caledar.set(2013, 6, 12);
		printDate(caledar);
		// 년,월,일,시,분을 설정(2013-6-12 오후 1:59)
		caledar.set(2013, 6, 12, 13, 59);
		printDate(caledar);
		// 년,월,일,시,분,초를 설정(2013-6-12 오후 1:59:30)
		caledar.set(2013, 6, 12, 13, 59, 30);
		printDate(caledar);

		// 100일 후
		caledar.add(Calendar.DATE, 100);
		printDate(caledar);

		// 10달 전
		caledar.add(Calendar.MONTH, -10);
		printDate(caledar);

		// 다시 오늘
		caledar = Calendar.getInstance();
		printDate(caledar);

		Calendar c = Calendar.getInstance();
		// DAY_OF_WEEK : 요일 출력 일요일1, 월요일2...
		c.set(c.DATE, 26);
		System.out.println(c.toString());
		System.out.println(c.get(c.DAY_OF_WEEK));
		System.out.println(c.get(c.DAY_OF_MONTH));
		System.out.println(c.get(c.DAY_OF_YEAR));
		System.out.println(c.getActualMaximum(c.DATE)); //그 달의 마지막 일수
		
		
		
		
		
	}

	public static void printDate(Calendar caledar) {
		System.out.println(caledar.get(Calendar.YEAR) + " 년 " + (caledar.get(Calendar.MONTH) + 1) + " 월 " + // 0 부터 시작함
				caledar.get(Calendar.DATE) + " 일 " + (caledar.get(Calendar.AM_PM) == 0 ? " 오전 " : " 오후 ") + // 오전 :0, 오후
																											// :1
				caledar.get(Calendar.HOUR) + " 시 " + caledar.get(Calendar.MINUTE) + " 분 " + caledar.get(Calendar.SECOND)
				+ " 초 ");
	}
}
