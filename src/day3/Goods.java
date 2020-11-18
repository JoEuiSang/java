package day3;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public void printInfo() {
		System.out.println("상품이름 : " + getName());
		System.out.println("상품가격 : " + getPrice());
		System.out.println("재고수량 : " + getCountStock());
		System.out.println("판매수량 : " + getCountSold());
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
