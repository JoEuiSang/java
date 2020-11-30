package day10._02PhoneMgr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneMgr {
	public static void inputPhone(int count, String fileName) throws IOException {
		// count��ŭ ��ȭ��ȣ �Է¹ޱ� (IO �̿��ؼ�)
		// �̸�, ��ȭ��ȣ �Է¹ޱ�
		// ���Ͽ� ex)
		// ���ǻ� 010-1111-2222
		// ȫ�浿 010-1111-2222
		// ������ 010-1111-2222
		// ���Ͽ� ����!!
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("src/day10/_02PhoneMgr/" + fileName); // ���Ϸ� ��������

		String name = "";
		String phoneNum = "";
		String content = "";
		while (count > 0) {
			System.out.println("�̸� �Է�");
			name = sc.next();
			System.out.println("��ȭ��ȣ �Է�");
			phoneNum = sc.next();

			content = name + ":" + phoneNum+"\n";

			fw.write(content);

			count--;
		}
		fw.close();
	}

	// �Ű������� ���� ���ϸ� �ش�Ǵ� ������ �о ���
	public static void printPhoneList(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/day10/_02PhoneMgr/" + fileName)); // ���Ϸ� �ޱ�
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line + "\n");
		}
	}

	// ������ �о, ���� �������� phone ��ü�� �����ϰ�, phone��ü�� list�� ��� ��ȯ
	public static List<Phone> getPhoneList(String fileName) throws IOException {
		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		BufferedReader br = new BufferedReader(new FileReader("src/day10/_02PhoneMgr/" + fileName)); // ���Ϸ� �ޱ�
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] data = line.split(":");
			phoneList.add(new Phone(data));
		}

		return phoneList;
	}

	public static void main(String[] args) throws IOException {
//		PhoneMgr pm = new PhoneMgr();
//		pm.inputPhone(3, "phoneList");

		inputPhone(3, "phoneList");
		printPhoneList("phoneList");
		
		System.out.println(getPhoneList("phoneList"));
		
	}
}
