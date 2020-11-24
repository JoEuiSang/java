package day5;

public class BirdTest2 {

	public static void main(String[] args) {
		새 b = null
				;
		int flag = Integer.parseInt(args[0]);
		if(flag == 1) {
			b = new 뻐꾸기();
		}else if(flag == 2) {
			b = new 참새();
		}else if(flag == 3) {
			b = new 오리();
		}
		
		b.날다();
		b.먹다();
		b.song();
		
//		새 bb = new 새();
		
	}

}
