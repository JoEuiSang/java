package day9._03IO;

import java.io.FileWriter;
import java.io.IOException;

public class IOExam2 {
	public static void main(String[] args) {
		int bt;
		int count = 0;
		FileWriter fw = null;
		try {
			// System.in.read() ==> 입력된값을 아스키 코드로 반환
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
				fw.close(); 		//클로즈를 해줘야 파일이 저장된다
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(count);
		
	}
}
