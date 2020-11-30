package day10._03dataIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class DataInOutExam {
	//������ Ÿ���� ������ �Լ��� �а��⸦ ��
	public static void main(String[] args) {
		//������ Ÿ�� ����
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/day10/_03dataIO/data.txt"));) {
			dos.writeBoolean(true);
			dos.writeInt(10);
			dos.writeChar('c');
			dos.writeDouble(10.0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try(
			DataInputStream dis = new DataInputStream(new FileInputStream("src/day10/_03dataIO/data.txt"));	)
		{
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
