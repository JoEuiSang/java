package day8._05�⺻API.date;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar caledar = Calendar.getInstance();
		// ����!
		printDate(caledar);
		// �⵵�� 2013������ ����
		caledar.set(Calendar.YEAR, 2013);
		printDate(caledar);
		// ��,��,���� ������(2013-6-12), ���� 0���� �����ϹǷ� -1�� ������Ѵ�.
		caledar.set(2013, 6, 12);
		printDate(caledar);
		// ��,��,��,��,���� ����(2013-6-12 ���� 1:59)
		caledar.set(2013, 6, 12, 13, 59);
		printDate(caledar);
		// ��,��,��,��,��,�ʸ� ����(2013-6-12 ���� 1:59:30)
		caledar.set(2013, 6, 12, 13, 59, 30);
		printDate(caledar);

		// 100�� ��
		caledar.add(Calendar.DATE, 100);
		printDate(caledar);

		// 10�� ��
		caledar.add(Calendar.MONTH, -10);
		printDate(caledar);

		// �ٽ� ����
		caledar = Calendar.getInstance();
		printDate(caledar);

		Calendar c = Calendar.getInstance();
		// DAY_OF_WEEK : ���� ��� �Ͽ���1, ������2...
		c.set(c.DATE, 26);
		System.out.println(c.toString());
		System.out.println(c.get(c.DAY_OF_WEEK));
		System.out.println(c.get(c.DAY_OF_MONTH));
		System.out.println(c.get(c.DAY_OF_YEAR));
		System.out.println(c.getActualMaximum(c.DATE)); //�� ���� ������ �ϼ�
		
		
		
		
		
	}

	public static void printDate(Calendar caledar) {
		System.out.println(caledar.get(Calendar.YEAR) + " �� " + (caledar.get(Calendar.MONTH) + 1) + " �� " + // 0 ���� ������
				caledar.get(Calendar.DATE) + " �� " + (caledar.get(Calendar.AM_PM) == 0 ? " ���� " : " ���� ") + // ���� :0, ����
																											// :1
				caledar.get(Calendar.HOUR) + " �� " + caledar.get(Calendar.MINUTE) + " �� " + caledar.get(Calendar.SECOND)
				+ " �� ");
	}
}
