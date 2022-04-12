package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2_1 {

	public static void main(String[] args) throws IOException {
		
		// 1. ������ ���� ����
		File outFile  = new File("src/chap19/Ex05/FileOutput2_1.txt"); // �⺻������ ��Ů������ default characterSet���� ����
		
		// 2. n-byte ���� ���� ó�� ( byte[] �� ó������ ������ ����) <== �ѱ��� ó��
		OutputStream os1 = new FileOutputStream(outFile , true);
		byte [] arr1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));	
		
		os1.write(arr1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
		
		
		// 3. n-byte ����  ( byte[] �� offset���� length���� ����Ʈ ������ ����)
		OutputStream os2 = new FileOutputStream(outFile , true);
		//byte [] arr2 = "�ݰ����ϴ�".getBytes(Charset.forName("UTF-8"));
		byte [] arr2 = "반갑습니다".getBytes(Charset.defaultCharset());
		
		os2.write(arr2 , 2 , 4);
		os2.write('\n');
		
		System.out.println(Charset.defaultCharset());
		
		os2.flush();
		os2.close();

	}

}
