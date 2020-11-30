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
		// count만큼 전화번호 입력받기 (IO 이용해서)
		// 이름, 전화번호 입력받기
		// 파일에 ex)
		// 조의상 010-1111-2222
		// 홍길동 010-1111-2222
		// 도도도 010-1111-2222
		// 파일에 저장!!
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("src/day10/_02PhoneMgr/" + fileName); // 파일로 내보내기

		String name = "";
		String phoneNum = "";
		String content = "";
		while (count > 0) {
			System.out.println("이름 입력");
			name = sc.next();
			System.out.println("전화번호 입력");
			phoneNum = sc.next();

			content = name + ":" + phoneNum+"\n";

			fw.write(content);

			count--;
		}
		fw.close();
	}

	// 매개변수로 받은 파일명에 해당되는 파일을 읽어서 출력
	public static void printPhoneList(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/day10/_02PhoneMgr/" + fileName)); // 파일로 받기
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line + "\n");
		}
	}

	// 파일을 읽어서, 읽은 내용으로 phone 객체를 생성하고, phone객체를 list에 담아 반환
	public static List<Phone> getPhoneList(String fileName) throws IOException {
		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		BufferedReader br = new BufferedReader(new FileReader("src/day10/_02PhoneMgr/" + fileName)); // 파일로 받기
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
