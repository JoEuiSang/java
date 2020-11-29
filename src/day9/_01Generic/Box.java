package day9._01Generic;

public class Box {
	private Object obj; // 어떤 객체가 들어와도 받을 수 있도록 object로 선언

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
