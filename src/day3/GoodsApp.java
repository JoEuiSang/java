package day3;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
//		��ǰ�̸�(name) �� "Nikon",
//		��(price)�� 400000,
//		�����(countStock)�� 30
//		�ȸ�����(countSold)�� 50
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
	
		camera.printInfo();

	}

}
