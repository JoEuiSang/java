package day9._03IO;

import java.io.FileWriter;
import java.io.IOException;

public class IOExam2 {
	public static void main(String[] args) {
		int bt;
		int count = 0;
		FileWriter fw = null;
		try {
			// System.in.read() ==> �ԷµȰ��� �ƽ�Ű �ڵ�� ��ȯ
			fw = new FileWriter("src/day9/_03IO/test.txt");
			while ((bt = System.in.read()) != -1) {
				System.out.println((char) bt);
				fw.write(bt);
				count++;
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close(); 		//Ŭ��� ����� ������ ����ȴ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(count);
		
	}
}
