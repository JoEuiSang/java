package day10._05Phone업그레이드;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


//객체 직렬화 : 객체를 줄을 세우겠다는 뜻
// 

public class PhoneObject {
	public static void main(String[] args) {
		List<Phone1> phoneList = new ArrayList<Phone1>();
		phoneList.add(new Phone1("kang", "010-111-1111"));
		phoneList.add(new Phone1("jo", "010-111-1111"));
		phoneList.add(new Phone1("lee", "010-111-1111"));
		phoneList.add(new Phone1("choi", "010-111-1111"));

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/day10/_05Phone업그레이드/phoneObject.txt"));) {
			oos.writeObject(phoneList);			
		} catch (Exception e) {
			// TODO: handle exception
		}

		List<Phone1> list =null;
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/day10/_05Phone업그레이드/phoneObject.txt"));) {
			list = (List<Phone1>) ois.readObject();

			for (Phone1 str : list) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(list);
	}
}
