package day7.오브젝트;

//모든 클래스의 시조 객체
public class _06오브젝트 {
	public static void main(String[] args) {
		_06오브젝트 my = new _06오브젝트();
		System.out.println(my.getClass());
		System.out.println(my.getClass().getName());
		System.out.println(my.toString());
		System.out.println(my.hashCode());
		System.out.println(my);
	}
}
