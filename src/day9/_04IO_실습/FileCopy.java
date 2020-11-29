package day9._04IO_실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//파일을 읽어 다른 파일에 복사하는것을 구현
public class FileCopy {
	public void createFile(String fileName) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		FileWriter fw = null;

		try {
			fw = new FileWriter(fileName);
			System.out.println("내용을 입력하세요");
			while ((line = br.readLine()) != null) {
				fw.write(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // 클로즈를 해줘야 파일이 저장된다
				System.out.println("파일이 저장되었습니다");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void copyFile(String inputFile, String outputFile) throws IOException {
		FileWriter fw = new FileWriter(outputFile);
		BufferedReader br = new BufferedReader(new FileReader(inputFile));

		String line = "";
		while ((line = br.readLine()) != null) {
			fw.write(line + "\n");
		}
		fw.close();
	}

	public static void main(String[] args) throws IOException {
		String path = "src/day9/_04IO_실습/";
		String origin = path + "origin.txt";
		String copy = path + "copy.txt";

		FileCopy fc = new FileCopy();
		fc.createFile(path + "origin.txt");
		fc.copyFile(origin, copy);
	}
}
