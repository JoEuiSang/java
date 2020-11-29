package day9._02Stack;

import java.util.Stack;

public class StackTest {
	//스택은 후입후출의 방식을 따르는 자료구조이다
	//벡터를 상속받았음
	//스택은 상속을 잘못받은 케이스,,,,, 중간에 삽인이 가능하다..원래는 하면안댐
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		System.out.println(stack.get(0));
		
		stack.add(0,"f");
		
		System.out.println(stack);
	}
	
	
	
}
