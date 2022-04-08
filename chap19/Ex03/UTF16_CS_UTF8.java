package chap19.Ex03;

import java.io.UnsupportedEncodingException;

// UTF-16 �������� : �ѱ�,���� ��� 2byte�� ǥ��
// UTF-8  �������� : ���� 1byte  , �ѱ� 3byte


public class UTF16_CS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte [] b1 = "abc".getBytes("UTF-16");
				// BOM �ēu �ڵ� 2byte
				// abc : 6byte
		byte [] b2 = "abc".getBytes("UTF-8");
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		for (byte b : b1) {
			System.out.printf("%02X" , b);		// 16������ ���
			System.out.println();
		}
		
		for (byte b : b2) {
			System.out.printf("%02X" , b);
			System.out.println();
		}
		
		System.out.println(new String(b1 , "UTF-16"));
		System.out.println(new String(b2 , "UTF-8"));
		
		System.out.println("===========");
		byte [] b3 = "������".getBytes("UTF-16");
		byte [] b4 = "������".getBytes("UTF-8");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		for (byte b : b3) {
			System.out.printf("%02X" , b);		// 16������ ���
		}
		
		System.out.println();
		
		for (byte b : b4) {
			System.out.printf("%02X" , b);
		}
		System.out.println();
		
		System.out.println(new String(b3 , "UTF-16"));
		System.out.println(new String(b4 , "UTF-8"));
		
		
		
		
		
	}

}
