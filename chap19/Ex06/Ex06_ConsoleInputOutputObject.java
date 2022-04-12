package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ֿܼ��� �迭100byte ���� �ѱ��� ��ǲ ���� ����  input.txt �� ���� ��   default
// input.txt ���Ͽ��� ���� �о �ֿܼ� ���.


public class Ex06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("src/chap19/Ex06/input.txt");
		
		System.out.println("�ѱ��� �Է��ϼ���");
		
		// �迭�� ���� 
		InputStream is1 = System.in;
		byte [] arr1 = new byte[100];
		is1.read(arr1);
		
		// input.txt�� ����
		OutputStream os1 = new FileOutputStream(f1);
		os1.write(arr1);
		os1.flush();
		os1.close();
		
		
		// input.txt ���
		InputStream is2 = new FileInputStream(f1);
		int data ;
		byte [] arr2 = new byte [100];
		while((data = is2.read(arr2)) != -1) {
			System.out.println(new String(arr2 , Charset.defaultCharset()));
		}
		
		
		

	}

}
