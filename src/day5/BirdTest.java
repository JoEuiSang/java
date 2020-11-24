package day5;

public class BirdTest {
	public static void test(새 a) {
		a.먹다();
	}
	public static void test2(뻐꾸기 aa) {
		
	}

//	public static void test(오리 a) {
//		a.먹다();
//	}
//
//	public static void test(참새 a) {
//		a.먹다();
//	}

	public static void main(String[] args) {
		뻐꾸기 a = new 뻐꾸기();
		a.song();
		a.날다();
		오리 b = new 오리();
		b.song();
		b.날다();
		참새 c =new 참새();
		c.song();
		c.날다();
		
		
		test(a);
		test(b);
		test(c);
		
		앵무새 d = new 세네갈();
		test(d);
		새 e = new 뻐꾸기();
		test2((뻐꾸기)e);
		
	}

}
