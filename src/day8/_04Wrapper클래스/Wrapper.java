package day8._04WrapperŬ����;

public class Wrapper {
	public static void m1(Integer i1) {
		System.out.println(i1);
	}

	public static void main(String[] args) {
		int i = 10;
		//�ڽ�: �⺻Ÿ�� > ��üŸ������ ����ȯ���ش�.
		Wrapper.m1(i);	//����ڽ�, �ڵ����� �⺻������Ÿ����, ��üŸ������ ����ȯ���ش�.
		
		
		
		
		Integer i2 = new Integer("10");
		
		int i3 = i2; //���� ��ڽ�, �ڵ����� ��üŸ�� > �⺻Ÿ��
//		i3 = i2.intValue(); //�� �۾��� �ڵ����� ���ذ�
		
		Integer i4 = i3; //���� �ڽ�, �ڵ����� �⺻Ÿ��>��üŸ��
		
		System.out.println(i4);
		System.out.println(i4.toString());
		
		
		//�f��Ŭ������ �Լ��� Ȱ��
		System.out.println(Integer.MAX_VALUE);	//�ִ밪 Ȯ��
		System.out.println(Integer.MIN_VALUE);
		
		//���ڷ� �̷���� ���ڿ��� ����ȯ ���ִ°͵� �f��Ŭ������ ���ش�
		
		String s = "123";
		int i5 = Integer.parseInt(s);
		System.out.println(i5);
		
		//���ڰ� ���ڷ� �̷�������� Ȯ��
		Character c = new Character('4');
		if(Character.isDigit(c)) {//���� c�� ���ڸ� ��Ÿ����
			System.out.println(Character.getNumericValue(c)); //���ڸ� ���ڷ� ��ȯ
		}
		
		Integer ii = new Integer(10);
		Double d = new Double( 3.1234566 );

		System.out.println(Integer.parseInt("123")); //���ڿ��� ������ ��ȯ
		System.out.println( Integer.parseInt( "10", 16 ) ); // 16���� ���ڿ��� ������ ��ȯ 
		System.out.println( Integer.toBinaryString( 28 ) ); // 2������ ǥ���� ���ڿ��� ��ȯ 
		System.out.println( Integer.bitCount( 28 ) ); // 2�������� 1�� ����
		System.out.println( Integer.toHexString(28) ); // 16���� ���ڿ��� ��ȯ
		System.out.println( ii.doubleValue() ); //  ������ double�� ��ȯ 
		System.out.println( d.toString() ); // Double�� ���ڿ��� ��ȯ 
		System.out.println( Double.parseDouble("44.13e-16")); // ���ڿ��� double�� ��ȯ

	}
}
