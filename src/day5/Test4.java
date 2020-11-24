package day5;

class Parent4{
	int i = 5;
	public int get(){
		return i;
	}
}

class Child4 extends Parent4{
	int i = 10;
	public int get(){
		return i;
	}
	
	public void print(){
		System.out.println(i);
	}
}

public class Test4 {
	public static void main(String[] args){
		Parent4 c4 = new Child4();
		System.out.println(c4.i);
		System.out.println(c4.get());
		
		int b = 5;
		byte i = (byte)b; //형변환   
		
		Child4 ccc = (Child4)c4;  //형변환 
		ccc.print();
		
		((Child4)c4).print();//형변환
		
		Parent4 p = ccc;
	}
}
