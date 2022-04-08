package chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//1. String getBytes() : String ---> Byte[] 분해  문자 ---> byte 변환 해서 배열에 저장
		
		byte [] array1 = "안녕".getBytes();   //charset 을 지정안함
		byte [] array2 = "떙큐".getBytes(Charset.defaultCharset()); // 땡큐 -> byte변환해서 배열에 저장
		byte [] array3 = "베리".getBytes(Charset.forName("MS949"));
		byte [] array4 = "떙큐".getBytes("UTF-8");  // 예외처리 필요
	}

}
