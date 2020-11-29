package day9._02Stack;

import java.util.ArrayList;

public class MyStack<E> {

	ArrayList<E> list = new ArrayList<E>();

	// �� �Է�
	public void push(E data) {
		list.add(data);
	}

	// pop : ���� �ֱٿ� ������ �� ��ȯ�ϸ鼭 ����
	public E pop() {
		// remove(index) : index ��ȣ�� ���� �����ϸ鼭 ��ȯ
		return list.remove(list.size() - 1);
	}

	// ���� �ֱٿ� ������ �� �ܼ� ����, ������ ����
	public E peek() {
		return list.get(list.size() - 1);
	}

	// ����ִ��� �Ǻ�
	public boolean empty() {
		return list.isEmpty();
	}

	// data�� (�Է���, ��, ������) ���� ��ȯ(����Ⱑ 1 ���� ����)
	// 4 , 3 , 2 , 1
	// ���ǻ� ,�̸��� , ������, ������ -->>> �̸��� -->> 3
	public int search(E data) {
		return list.size() - list.indexOf(data);
	}

	@Override
	public String toString() {
		return "" + list;
	}

	public static void main(String[] args) {
		MyStack<String> my = new MyStack<String>();

		// 1. ����
		my.push("���ǻ�");
		my.push("�̸���");
		my.push("������");
		my.push("������");
		System.out.println(my); // ���� Ȯ��

		// 2. �������� Ȯ��
		System.out.println("������ �� Ȯ��:" + my.peek()); // �� ������ ��¸�
		System.out.println(my); // ��¸� �ƴ��� Ȯ��

		// 3. �˻�
		System.out.println("�̸��� ���?: " + my.search("�̸���")); // ���ڰ� �� ���� ��ȯ
		System.out.println("���ǻ� ���?: " + my.search("���ǻ�"));

		// 4. ������ �̱�
		System.out.println("������ �� �̱�: " + my.pop()); // �� ������ �����鼭 Ȯ��
		System.out.println(my); // �̾������� Ȯ��

		// 5. ������� Ȯ��
		System.out.println("�����? : " + my.empty()); // ������� Ȯ�� ������� true
		my.pop();
		my.pop();
		my.pop();
		System.out.println("�����? : " + my.empty()); // ������� Ȯ�� ������� true
	}
}
