package day9._02Stack;

import java.util.Stack;

public class StackTest {
	//������ ���������� ����� ������ �ڷᱸ���̴�
	//���͸� ��ӹ޾���
	//������ ����� �߸����� ���̽�,,,,, �߰��� ������ �����ϴ�..������ �ϸ�ȴ�
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
