package day10._04ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExam {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("jo");
		nameList.add("kang");
		nameList.add("kim");
		nameList.add("lee");
		
		//°´Ã¼ ¾²±â
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/day10/_04ObjectStream/object.txt"))) {
			oos.writeObject(nameList);			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//°´Ã¼ ÀÐ±â
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/day10/_04ObjectStream/object.txt"))) {
			List<String> list = (List<String>)ois.readObject();
			
			for(String str:list) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
