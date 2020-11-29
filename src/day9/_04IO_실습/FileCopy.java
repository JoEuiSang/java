package day9._04IO_�ǽ�;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//������ �о� �ٸ� ���Ͽ� �����ϴ°��� ����
public class FileCopy {
	public void createFile(String fileName) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		FileWriter fw = null;

		try {
			fw = new FileWriter(fileName);
			System.out.println("������ �Է��ϼ���");
			while ((line = br.readLine()) != null) {
				fw.write(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // Ŭ��� ����� ������ ����ȴ�
				System.out.println("������ ����Ǿ����ϴ�");
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
		String path = "src/day9/_04IO_�ǽ�/";
		String origin = path + "origin.txt";
		String copy = path + "copy.txt";

		FileCopy fc = new FileCopy();
		fc.createFile(path + "origin.txt");
		fc.copyFile(origin, copy);
	}
}
