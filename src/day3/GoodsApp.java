package day3;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("Nikon",400000,30,50);
		Goods computer = new Goods("SamSung",600000,50,100);
		Goods tv = new Goods("LG");
		Goods phone = new Goods("V50");
		
//		��ǰ�̸�(name) �� "Nikon",
//		��(price)�� 400000,
//		�����(countStock)�� 30
//		�ȸ�����(countSold)�� 50
		
//		camera.setName("Nikon");
//		camera.setPrice(400000);
//		camera.setCountStock(30);
//		camera.setCountSold(50);
	
		camera.printInfo();
		computer.printInfo();
		tv.printInfo();
		phone.printInfo();
	}

}
