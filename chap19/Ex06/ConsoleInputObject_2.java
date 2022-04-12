package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		
		//	1-byte 단위 읽기
		
		InputStream is = System.in;  
		
		System.out.println("영문을 입력하세요 >>");
		
		int data;
		while ((data = is.read()) != '\r') {
			System.out.print((char)data);
		}
		is.read();   // 10 <== \n
		
		System.out.println();
		System.out.println();
		System.out.println("===================");
		
		//2. n-byte 읽기 ( byte[] 의 처음 위치에서 읽은 데이터 저장)
		byte [] arr1 = new byte [100];
		int count1 = is.read(arr1);
			// count1 : 배열에서 읽은 값의 갯수를 저장 
		
		for (int i = 0 ; i <count1 ; i++) {
			System.out.print((char)arr1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		
		//3. n-byte  단위로 읽고 (length만큼 읽어 와서 byte[]  offset위치에 저장
		
		byte [] arr2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(arr2 , offset , length);
		
		for(int i = 0 ; i < offset+length ; i ++) {
			System.out.print((char)arr2[i]);
		}
		
		is.close();  // 제일마지막에 close() 해줘야 한다   중간에 close()하면 다시 못불러옴
		
				

	}

}
