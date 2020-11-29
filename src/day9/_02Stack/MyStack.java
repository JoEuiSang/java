package day9._02Stack;

import java.util.ArrayList;

public class MyStack<E> {

	ArrayList<E> list = new ArrayList<E>();

	// 값 입력
	public void push(E data) {
		list.add(data);
	}

	// pop : 가장 최근에 보관한 값 반환하면서 삭제
	public E pop() {
		// remove(index) : index 번호의 값을 삭제하면서 반환
		return list.remove(list.size() - 1);
	}

	// 가장 최근에 보관한 값 단순 참조, 꺼내지 않음
	public E peek() {
		return list.get(list.size() - 1);
	}

	// 비어있는지 판별
	public boolean empty() {
		return list.isEmpty();
	}

	// data를 (입력한, 들어간, 보관된) 순서 반환(꼭대기가 1 부터 시작)
	// 4 , 3 , 2 , 1
	// 조의상 ,이명재 , 원세영, 강동섭 -->>> 이명재 -->> 3
	public int search(E data) {
		return list.size() - list.indexOf(data);
	}

	@Override
	public String toString() {
		return "" + list;
	}

	public static void main(String[] args) {
		MyStack<String> my = new MyStack<String>();

		// 1. 삽입
		my.push("조의상");
		my.push("이명재");
		my.push("원세영");
		my.push("강동섭");
		System.out.println(my); // 삽입 확인

		// 2. 마지막값 확인
		System.out.println("마지막 값 확인:" + my.peek()); // 맨 마지막 출력만
		System.out.println(my); // 출력만 됐는지 확인

		// 3. 검색
		System.out.println("이명재 어디?: " + my.search("이명재")); // 인자가 들어간 순번 반환
		System.out.println("조의상 어디?: " + my.search("조의상"));

		// 4. 마지막 뽑기
		System.out.println("마지막 값 뽑기: " + my.pop()); // 맨 마지막 뽑으면서 확인
		System.out.println(my); // 뽑아졌는지 확인

		// 5. 비었는지 확인
		System.out.println("비었어? : " + my.empty()); // 비었는지 확인 비었으면 true
		my.pop();
		my.pop();
		my.pop();
		System.out.println("비었어? : " + my.empty()); // 비었는지 확인 비었으면 true
	}
}
