package chap19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// InputStream : ��� ��Ʈ��
	//  Int ==> 5555(����) ==> 5555(����) === > int


// DataInputStream : �߰������ �����ϴ� ��Ʈ�� , ��ݽ�Ʈ���̹ݵ�� ���� , �ܵ����� ����� �� ����
		// �پ��� ������ �����͸� ������ �����ҋ� ���

public class DataInputStream_1 {

	public static void main(String[] args) {
		
		// ���ϻ��� 
		File df = new File ("src\\chap19\\Ex07\\file1.data");

		
		// ������ ����
		try (	OutputStream os = new FileOutputStream(df);
				DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
			
		}catch(IOException e) {} 
		
		
		// ������ �б� (DataInputStream)
		
		try (
				InputStream is = new FileInputStream(df);
				DataInputStream dis = new DataInputStream(is);
				){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
