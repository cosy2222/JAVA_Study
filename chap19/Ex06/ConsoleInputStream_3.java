package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputStream_3 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		
		System.out.println("한글을 입력하세요");
		
		// n-byte 배열 읽기
		byte [] arr1 = new byte[100];
		int count1 = is.read(arr1);
		
		
		String str1 = new String(arr1 , 0 , count1 , Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("배열의 방의 총갯수 r 과  n을 포함" + count1);
		
		
		//  n-byte 단위 읽기
		byte[] arr2 = new byte[9];
		int a = 3;
		int b = 6;
		int count2 = is.read(arr2 ,a , b );
		
		String str2 = new String (arr2 , 0 , a+b , Charset.defaultCharset());
		System.out.println(str2);
	

	}

}
