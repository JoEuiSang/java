package day3;

public class Dice {
	int eye;
	
	public void cast() {
		eye = (int)(Math.random()*6+1);
		System.out.println(eye+"가 나왔습니다");
	}

}
