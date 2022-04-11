package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {
		
		// 1. �Է����� ����
		File inFile = new File ("src/chap19/Ex04/FileInputStream1.txt");
		
		
		
		// 2. byte ���� �б�  (�� ����Ʈ�� �о ó��)
		InputStream is1 = null;
		
		try {
			is1 = new FileInputStream(inFile);
			int data;
			while((data = is1.read()) != -1) {		// ������ �����Ƿ� read() �޼ҵ常 ��� , �ѱ��� ��� read(byte�迭)
				System.out.print((char)data);
			}	
		}catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
		}finally {
			if(is1 != null) {
				try {
					is1.close();
				} catch (IOException e) {
				}
			}
		}
		
		System.out.println();
		System.out.println("==============================");
		
		// 3. try (with resource) {} �� ����
		
		
		try(InputStream is1_1 = new FileInputStream(inFile);) {
			// try(with resource : ��ü ����) <== close()�� �ڵ����� �ȴ� FileInputStream�� Closeable�������̽��� ���� 
			int data;
			while((data = is1_1.read()) != -1) {		// ������ �����Ƿ� read() �޼ҵ常 ��� , �ѱ��� ��� read(byte�迭)
				System.out.print((char)data);
			}	
		}catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
		}
		
		
		System.out.println();
		System.out.println("========================");
		//4. n-byte ���� �� �б� (byte[]�� ó����ġ���� ���� ���� ������ ����)	: ���� ����Ʈ�� ���ÿ� �о ó���ӵ��� ����
					// �迭�� ���� ũ�⸸ŭ �о byte�迭�� ����
					// �ѱ�ó������ 
	
		
		InputStream is2 = new FileInputStream(inFile);
		byte [] arr1 = new byte[5];
		int count1 ;
		
		while(   (count1 = is2.read(arr1)) != -1   ) {
					  	   // is2.read() : 1byte �� �д´�		// �ѱ��� ó�� ���Ѵ�
						   // is2.read(bytearr) : 9byte�� �д´�
			
			
			for(int i = 0 ; i < count1 ; i++) {
				System.out.print((char)arr1[i]);
			}
			System.out.println(" : count1 = " +count1);
			
			String str = new String (arr1 , Charset.forName("MS949"));
			
		}
		
		is2.close();
		
		
		
		// 4-2.  n-byte������ �о �ѱ� ó�� [�迭������ �о �ѱ�ó��]

		InputStream is3 = new FileInputStream(inFile);
		byte[] arr2 = new byte[100];
		
		int count2;
		
		while((count2 = is3.read(arr2)) != -1) {
			System.out.println(new String (arr2 , Charset.forName("MS949")));
			
		}
		
		System.out.println("===========================");
		
		
		//  4-3.  n-byte ������ �о ����.  offset , length ���
		
		InputStream is4 = new FileInputStream(inFile);
		byte [] arr3 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is4.read(arr3 , offset , length);	// length��ŭ �տ��� �о�ͼ� arr3 �� offset��ġ�� ����
		
		for ( int i = 0 ; i < offset+count4 ; i++ ) {
			System.out.print((char)arr3[i]);
		}
				
		is4.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
