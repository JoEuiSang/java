package day9._03IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam1 {
	public static void main(String[] args) throws IOException {
		//Ű����κ��� ���� �Է� �ް� �;��~~
		// Ű���� - System.in  �� Ÿ����  InputStream
		//���� ~~ ��� ~~      BufferedReader  -  readLine()
		
		//System.in = ���� �ٿ�: ����,, �Է��� ������ �Ǵ����� ���� 3��ġ
		//InputStreamReader = �߰� ���� Ŀ���� ,, ������ �������� ĸ�� ������ ��������
		//BufferedReader = ���� �����Ǽ� ���� : ������,, ���� �л���, ���и��, ������� ���� ���� �������� ���� 5��ġ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //Ű����� �ޱ�
		BufferedReader br2 = new BufferedReader(new FileReader("src/day9/_03IO/fileExam"));  //���Ϸ� �ޱ�
		
		
//		String s = br.readLine();
//		System.out.println(s);
		
		String s2 = br2.readLine();	//1��°�� �б�
		System.out.println(s2);
		
		//������ �� �б�
		String s3;
		FileWriter fw = new FileWriter("src/day9/_03IO/fileExamCopy");	//���Ϸ� ��������
		while((s3 = br2.readLine())!=null) {
			System.out.println(s3);	
			fw.write(s3+"\n");	
		}
		fw.close();
	}
}
