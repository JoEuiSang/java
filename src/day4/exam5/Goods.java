package day4.exam5;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
		this("û�ұ�", 100000, 100,10);
	}

	public Goods(String name) {
		this(name, 0, 0, 0);
	}

	public Goods(String name, int price) {
		this(name, price, 0, 0);
	}

	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
		System.out.println(getName() + "�� �����Ǿ����ϴ�.");
	}

	public void printInfo() {
		System.out.println("��ǰ�̸� : " + getName());
		System.out.println("��ǰ���� : " + getPrice());
		System.out.println("������ : " + getCountStock());
		System.out.println("�Ǹż��� : " + getCountSold());
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

}
