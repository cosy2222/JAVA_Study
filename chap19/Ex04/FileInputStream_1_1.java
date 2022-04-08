package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {

	public static void main(String[] args) {
		
		//1. ���ܸ� ���� ó��
		
		InputStream is = null;
		
		File inFile = new File("src\\chap19\\Files\\FileInputStream1.txt");
		try {
			is = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		
		int data;
		try {
			while((data = is.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻�");
		}
		
		try {
			if(is != null) {
				is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("==========================");
		
		// ���ܸ� �Ѳ����� ó��
		
		InputStream is2 = null;
		int data2 = 0;
		
		try {
			is2 = new FileInputStream(inFile);
			
			while( (data2 = is2.read()) != -1) {	
				System.out.print((char)data2);
			}
		} catch (IOException e) {	// IOException ���� �ѹ��� ó��
			System.out.println("���ܰ� �߻� �߽��ϴ�");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("���� �߻�");
			}
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
