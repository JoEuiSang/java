package day4.exam5;

public class AllConstructor {
	Goods g;
	Point p;
	Song s;

	public AllConstructor() {
		this.g = new Goods();
		this.p = new Point();
		this.s = new Song();
	}

	public void printAllInfo() {
		g.printInfo();
		p.show();
		s.show();
	}
	
	public static void main(String[] args) {
		AllConstructor all = new AllConstructor();
		all.printAllInfo();
	}
}
