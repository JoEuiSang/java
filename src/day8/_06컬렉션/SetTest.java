package day8._06�÷���;

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
	//set : ���� ����
	// list : ������ �ִ�
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("c");
		set.add("d");
		set.add("b");
		set.add("c");		//�̹� �ִ°��̶� �����ʴ´�
		
		System.out.println(set); //
		
		Set<Book> bookSet = new HashSet<Book>();
		
		bookSet.add(new Book("java"));
		bookSet.add(new Book("MySQL"));
		bookSet.add(new Book("algorithm"));
		bookSet.add(new Book("CS"));
		bookSet.add(new Book("java"));  //equal �Լ��� ���� �̹� �ִٰ� �Ǵ��Ͽ� ���� ����
		
		System.out.println(bookSet);
		
		//set�� �����͸� ��������???
		Iterator<Book> iter = bookSet.iterator();
		
		
		while(iter.hasNext()) {	//hasnext() : ��Ұ� �ִ��� Ȯ��
			System.out.println(iter.next());	//������ ������,��Ұ� ���������� �ʴ´�
		}
		
		for (Book book : bookSet) {
			System.out.println(book);
		}
		
		
		
		System.out.println(bookSet);
		
	}
	
}
