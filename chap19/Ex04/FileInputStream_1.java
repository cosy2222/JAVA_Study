package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {
		
		//�����۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		//1. �Է� ���� ����
			// �����η� ����
		File inFile1 = new File ("D:\\ksm\\JAVA\\kosmo_ksm\\src\\chap19\\Files\\FileInputStream1.txt");
		
			// ����η� ���� : ���� �۾����丮�� �������� ����
		File inFile = new File("src\\chap19\\Files\\FileInputStream1.txt");
		
		// InputStream ��ü�� �����ؾ� ������ ������ ������ �ִ�.
		InputStream is = new FileInputStream(inFile);
			//InputStream�� �߻�Ŭ���� , ������ü������ �� �� ���� Ÿ�������� ����
		
		// Java���� �ٹٲ� ó��
		//   -UNIX : \n
		//   -Windows : \r\n      <==  \r �� ���� ����
		//   -MAC     :  \r  
		

		
		
		// �� ����Ʈ �����͸� �о char�� ��ȯ�� ���
		System.out.print((char)is.read()); 	// read() �ѹ���Ʈ�� �о���� 
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		System.out.println();
		System.out.println("=============================");
		
		// ��Ʈ���� ���� ������ �޸𸮿��� ���� �ȴ�. ���� �б� ���ؼ��� ���ο� ��Ʈ���� ���� �ؾ� �Ѵ� 
		
		
		// int read() : �� ����Ʈ�� �о ����Ÿ������ ���� , ���� �����Ͱ� ���� ��������������� -1����
		// While���� ����ؼ� �ѹ��� ���
		InputStream is1 = new FileInputStream(inFile);
		
		int data ; 
		
		while ((data = is1.read()) != -1) {	// ������������ ��� ��ȯ
			System.out.print((char) data);
		}
			// ! �߿� : read() : 1byte�� �о����  ��ȯŸ���� int �� 
			// FileInputStream�� �ݵ�� index 0������ �о����
				// FileRandomAccess �� ����ؼ� ������ index���� �о����
		
		System.out.println();
		System.out.println();
		System.out.println("====================");
		
		InputStream is2 = new FileInputStream(inFile);
		
		while ((data = is2.read()) != -1) {	// ������������ ��� ��ȯ      (������������������ -1����)
			System.out.println("���� ������ : " + (char) data + ", ���� ����Ʈ �� : " + is2.available());
		}
		
		is.close();
		is1.close();
		is2.close();

	}

}
