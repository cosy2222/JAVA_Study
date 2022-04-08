package chap19.Ex01;

import java.io.File;
import java.io.IOException;

// ���� : ��Ŭ�������� ������ ������ C:/ �� �����ҋ� ���ѹ��������� �����߻����� 
//								��Ŭ������ �����ڱ������� �����ϸ� �ذᰡ��

// File��ü���� �����ĺ��ڸ� ������ ���
	//  C:/abc/abc.txt



	// 1. Windows�� ���  : String path = "C:\\abc\\abc.txt"
	//	  windows10 	: String path = "C:/abc/abc.txt"


	// 2. MAC�� ���  : String path = "C:/abc/abc.txt"
	
	// ����ȯ�濡�� ȣȯ����
	// "C:" + File.separator + "temp001" + File.separator + "newfile03.txt"


public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		
		//1. File ��ü�� ����ؼ� ��������. �ش� �����̳� ������ �������� �ʴ°�� 
		File tempdir = new File("C:/temp001");
		if(!tempdir.exists()) {	// �ش� ��ο� �����̳� ������ �����ϸ� true,false
			tempdir.mkdir();	// �������� ��ɾ�
		}
		
		System.out.println(tempdir.exists());
		
		//2. File ��ü�� ����ؼ� ���ϻ��� 
		File newfile = new File("C:/temp001/newfile.txt");	
		if(!newfile.exists()) {
			newfile.createNewFile();	// ����ó�� �ʿ� 
		}
		System.out.println(newfile.exists());
		System.out.println("============================");
		
		//3. ���� ������ 
		File newfile2 = new File("C:\\temp001\\newfile01.txt");	// windows10 ����������
		File newfile3 = new File("C:/temp001/newfile02.txt");	//windows10 , Mac
		if(! newfile2.exists()) {
			newfile2.createNewFile();
		}
		if(! newfile3.exists()) {
			newfile3.createNewFile();
		}
		System.out.println(newfile2.exists());
		System.out.println(newfile3.exists());
		
		// ��� OS���� �������� �ĺ������� �ڵ�
		File newfile4 = new File("C:" + File.separator + "temp001" + File.separator + "newfile03.txt");
		if(! newfile4.exists()) {
			newfile4.createNewFile();
		}
		System.out.println(newfile4.exists());
		
		//4.�����η� ó�� : �ٸ� �ý������� �̵��� ��� �� �ý��� ȯ�濡 �µ��� ������ �ʿ�
		File newfile5 = new File("C:/temp001/newfile05.txt");	// �����η� ó��
		System.out.println(newfile5.getAbsolutePath());	 // file��ü�� ����� ������ �����θ� ���
		
		//5.����η� ó��  <== ������� 
		// ���� ���� �۾������� ��ġ�� �˾ƾ��Ѵ� 
		System.out.println(System.getProperty("user.dir")); //���� �۾� ������ ��ġ 
				// ��Ŭ���� ���� ���� ��ġ
		
		File newfile6 = new File("newFile06.txt");	// �����
		System.out.println(newfile6.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
