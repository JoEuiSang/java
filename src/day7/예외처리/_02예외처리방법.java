package day7.����ó��;

public class _02����ó����� {
	public static void main(String[] args) {
		int a = 1;
		double b = 0;

		int[] iarr = new int[1];

		try {// ���ܰ� �� �� ���� �κ��� try ��� �ȿ� ����
			b = 100 / a; 
			iarr[1] = 10;
		} catch (ArithmeticException e) {	//ArithmeticException�� ���� ó��
			System.out.println("Exception occurred : " + e);
			a = 1;
			b = 100 / a;
		} 		
		catch (ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException�� ���� ó��
			e.printStackTrace();
		} 
		catch (Exception e) {		//������ ����� ���� ���� ��� ���ܿ����Ͽ� ó��
			e.printStackTrace();
		}
		finally {	//���ܰ� ���� �ȳ��� �����ϴ� ����
			System.out.println("���� �׻� �����");
		}

		System.out.println(b);

	}
}
