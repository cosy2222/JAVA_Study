package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		
		//	1-byte ���� �б�
		
		InputStream is = System.in;  
		
		System.out.println("������ �Է��ϼ��� >>");
		
		int data;
		while ((data = is.read()) != '\r') {
			System.out.print((char)data);
		}
		is.read();   // 10 <== \n
		
		System.out.println();
		System.out.println();
		System.out.println("===================");
		
		//2. n-byte �б� ( byte[] �� ó�� ��ġ���� ���� ������ ����)
		byte [] arr1 = new byte [100];
		int count1 = is.read(arr1);
			// count1 : �迭���� ���� ���� ������ ���� 
		
		for (int i = 0 ; i <count1 ; i++) {
			System.out.print((char)arr1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		
		//3. n-byte  ������ �а� (length��ŭ �о� �ͼ� byte[]  offset��ġ�� ����
		
		byte [] arr2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(arr2 , offset , length);
		
		for(int i = 0 ; i < offset+length ; i ++) {
			System.out.print((char)arr2[i]);
		}
		
		is.close();  // ���ϸ������� close() ����� �Ѵ�   �߰��� close()�ϸ� �ٽ� ���ҷ���
		
				

	}

}
