package chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;	// System.out : 콘솔에 출력 , byte 출력
		
		// 1. 1byte출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');		// 버퍼에 저장됨 
		
		os.flush();   // 버퍼의 내용을 콘솔에 출력
		
		// 2. n-byte 출력
		byte [] arr1 = "hello!".getBytes();
		
		os.write(arr1);
		os.write('\n');
		os.flush();
		
		
		// 3. n-byte 출력 
		byte [] arr2 = "hi your so fucking ugly".getBytes();
		os.write(arr2,7,8);  // write (byte배열 , offset , length) ;
		os.flush();
		
		os.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
