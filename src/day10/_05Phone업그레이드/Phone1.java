package day10._05Phone업그레이드;

public class Phone1 {
	String name;
	String phoneNum;
	
	public Phone1(String[] data) {
		name = data[0];
		phoneNum = data[1];
	}

	public Phone1(String string, String string2) {
		name = string;
		phoneNum = string2;
	}	

	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", phoneNum=" + phoneNum + "]";
	}
	
	

}
