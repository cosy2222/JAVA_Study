package chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;	// System.out : �ֿܼ� ��� , byte ���
		
		// 1. 1byte���
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');		// ���ۿ� ����� 
		
		os.flush();   // ������ ������ �ֿܼ� ���
		
		// 2. n-byte ���
		byte [] arr1 = "hello!".getBytes();
		
		os.write(arr1);
		os.write('\n');
		os.flush();
		
		
		// 3. n-byte ��� 
		byte [] arr2 = "hi your so fucking ugly".getBytes();
		os.write(arr2,7,8);  // write (byte�迭 , offset , length) ;
		os.flush();
		
		os.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
