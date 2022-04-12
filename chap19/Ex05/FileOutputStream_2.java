package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// FileInputStream�� ����ؼ� �ѱ� ó��

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		
		
		// 1. ������ ���� ����
		File outFile  = new File("src/chap19/Ex05/FileOutput2.txt"); // �⺻������ ��Ů������ default characterSet���� ����
		
		// 2. n-byte ���� ���� ó�� ( byte[] �� ó������ ������ ����) <== �ѱ��� ó��
		OutputStream os1 = new FileOutputStream(outFile);
		byte [] arr1 = "�ȳ��ϼ���".getBytes(Charset.forName("MS949"));	
		
		os1.write(arr1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
		
		
		// 3. n-byte ����  ( byte[] �� offset���� length���� ����Ʈ ������ ����)
		OutputStream os2 = new FileOutputStream(outFile , true);
		byte [] arr2 = "�ݰ����ϴ�".getBytes(Charset.forName("MS949"));
		
		os2.write(arr2 , 2 , 4);
		os2.write('\n');
		
		
		os2.flush();
		os2.close();
		
		
		
		
		
	}

}
