package day8._06컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Book{
	String name="";

	public Book(String name) {	
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class SetTest {
	//set : 순서 없다
	// list : 순서가 있다
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("c");
		set.add("d");
		set.add("b");
		set.add("c");		//이미 있는값이라 들어가지않는다
		
		System.out.println(set); //
		
		Set<Book> bookSet = new HashSet<Book>();
		
		bookSet.add(new Book("java"));
		bookSet.add(new Book("MySQL"));
		bookSet.add(new Book("algorithm"));
		bookSet.add(new Book("CS"));
		bookSet.add(new Book("java"));  //equal 함수에 의해 이미 있다고 판단하여 들어가지 않음
		
		System.out.println(bookSet);
		
		//set의 데이터를 꺼내려면???
		Iterator<Book> iter = bookSet.iterator();
		
		
		while(iter.hasNext()) {	//hasnext() : 요소가 있는지 확인
			System.out.println(iter.next());	//다음꺼 꺼내기,요소가 삭제되지는 않는다
		}
		
		for (Book book : bookSet) {
			System.out.println(book);
		}
		
		
		
		System.out.println(bookSet);
		
	}
	
}
