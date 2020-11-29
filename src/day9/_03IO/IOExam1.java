package day9._03IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam1 {
	public static void main(String[] args) throws IOException {
		//키보드로부터 한줄 입력 받고 싶어요~~
		// 키보드 - System.in  의 타입은  InputStream
		//한줄 ~~ 기능 ~~      BufferedReader  -  readLine()
		
		//System.in = 물의 근원: 수도,, 입력의 시작이 되는지점 지름 3센치
		//InputStreamReader = 중간 연결 커넥터 ,, 지름이 맞지않은 캡과 수도를 연결해줌
		//BufferedReader = 물이 변형되서 나옴 : 샤워기,, 물을 분사모드, 수압모드, 등등으로 여러 모드로 나오게함 지름 5센치 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //키보드로 받기
		BufferedReader br2 = new BufferedReader(new FileReader("src/day9/_03IO/fileExam"));  //파일로 받기
		
		
//		String s = br.readLine();
//		System.out.println(s);
		
		String s2 = br2.readLine();	//1번째줄 읽기
		System.out.println(s2);
		
		//나머지 줄 읽기
		String s3;
		FileWriter fw = new FileWriter("src/day9/_03IO/fileExamCopy");	//파일로 내보내기
		while((s3 = br2.readLine())!=null) {
			System.out.println(s3);	
			fw.write(s3+"\n");	
		}
		fw.close();
	}
}
