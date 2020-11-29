package day9._01Generic;

//가상 타입 E를 정의해준다
public class GenericBox<E> {
	
	//다른곳에서 GenericBox를 제네릭을 설정하여 선언할때 E가 해당 타입으로 바뀐다
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
	
}
