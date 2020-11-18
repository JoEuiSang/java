package day3;

public class Book {
	String bookName;
	String author;
	String isbn;
	int publishingYear;
	int stratPage = 0, endPage = 100, currentPage = 0;

	public int nextPage() {
		this.currentPage += 1;
		return this.currentPage;
	}

	public void goPage(int page) {
		this.currentPage = page;
	}

}
