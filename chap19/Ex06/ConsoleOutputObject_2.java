package chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ѱ��� �ֿܼ� ��� .   1-byte�� ��½� �ѱ������ �ȵ� , n-byte�� ����ؾ� �ѱ����


public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;	// �ֿܼ� ���
		
		
		// n-byte ��� ( byte[] �迭�� ó������ ������ ������ ����)
		byte[] arr1 = "�ȳ��ϼ���".getBytes(Charset.defaultCharset());
		os.write(arr1);
		os.write('\n');   // write() ���ۿ� ����
		
		os.flush();		 // flush() ������ ������ �ֿܼ� ���
		
		
		// n-byte ��� (byte [] �� offset ���� length ���� byte������ ���� ) 
		byte [] arr2 = "�ݰ����ϴ�".getBytes(Charset.defaultCharset());
		
		os.write(arr2,6,4);		// 6byte ������ 4byte�� ó�� 
		
		os.flush();
		
		os.close();
		
	}

}
