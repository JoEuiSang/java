package day10._02PhoneMgr;

public class Phone {
	String name;
	String phoneNum;
	
	public Phone(String[] data) {
		name = data[0];
		phoneNum = data[1];
	}

	public Phone(String string, String string2) {
		name = string;
		phoneNum = string2;
	}	

	@Override
	public String toString() {
		return "Phone [name=" + name + ", phoneNum=" + phoneNum + "]";
	}
	
	

}
