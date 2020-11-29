package day9._03IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


//url 소스코드 입력받기
public class IOExam3 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://naver.com");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

		String s="";
		while((s = br.readLine())!=null) {
			System.out.println(s);	
		}
		
	}
}
