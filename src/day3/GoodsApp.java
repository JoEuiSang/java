package day3;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
//		상품이름(name) 은 "Nikon",
//		값(price)은 400000,
//		재고개수(countStock)은 30
//		팔린개수(countSold)는 50
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
	
		camera.printInfo();

	}

}
