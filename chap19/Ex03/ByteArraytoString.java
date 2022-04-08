package chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//1. String getBytes() : String ---> Byte[] ����  ���� ---> byte ��ȯ �ؼ� �迭�� ����
		
		byte [] array1 = "�ȳ�".getBytes();   //charset �� ��������
		byte [] array2 = "��ť".getBytes(Charset.defaultCharset()); // ��ť -> byte��ȯ�ؼ� �迭�� ����
		byte [] array3 = "����".getBytes(Charset.forName("MS949"));
		byte [] array4 = "��ť".getBytes("UTF-8");  // ����ó�� �ʿ�
	}

}
