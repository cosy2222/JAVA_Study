package chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		
		// 1. C:/�� �۾����� ���� 
		
		File tempdir = new File("C:/temp");
		if(! tempdir.exists()) {
			tempdir.mkdir();
		}
		
		//2. ���ϰ�ü ���� (C:/windows)
		File file = new File("C:/windows");
		
		//3. ���� �޼ҵ��� 
		System.out.println("���� ��� ��� : " + file.getAbsolutePath());
		System.out.println("������ �������� (?) : " + file.isDirectory());
		System.out.println("������ �������� (?) : " + file.isFile());
		System.out.println("����/���� �̸� ��� : " + file.getName()); // ����,���� �̸� 
		System.out.println("�θ� ���� �̸� : " + file.getParent()); // �θ������̸�
		
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir()); // ������ �� ������ ��� :true 
											  // �������� ���� ��� : false
		System.out.println(newfile1.exists());
		
		File newfile2 = new File("C:/temp/bcd/cde");	// ������ ������ �Ѳ����� �����ϱ� 
		System.out.println(newfile2.mkdir());	// false , ������������ �Ѳ����� ������ �ȵȴ�
		System.out.println(newfile2.mkdirs());	// true , ������������ �Ѳ����� ����
		
		File newfile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newfile3.mkdirs());
		
		//4. File ��ü�� ����ؼ� ���������� ��������
		 File [] fname = file.listFiles(); // file : "C:/windows" ������ ��� ������ ������ �̸��� �迭�� ����
		
		for ( File k : fname) {
			System.out.println((k.isDirectory() ? "���� : " : "���� :") + k.getName());
		}
		
		
		
		
		

	}

}
