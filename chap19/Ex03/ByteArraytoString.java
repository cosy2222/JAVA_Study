package chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//1. String getBytes() : String ---> Byte[] 분해  문자 ---> byte 변환 해서 배열에 저장
		
		byte [] array1 = "안녕".getBytes();   //charset 을 지정안함
		byte [] array2 = "떙큐".getBytes(Charset.defaultCharset()); // 땡큐 -> byte변환해서 배열에 저장
		byte [] array3 = "베리".getBytes(Charset.forName("MS949")); // 예외발생 : 실행시
		byte [] array4 = "떙큐".getBytes("UTF-8");  // 예외처리 필요 : 일반예외
		
		
		//2. 각 인코딩의 바이트 수 출력
		System.out.println(array1.length);  // MS949 : 한글 1자 2byte
		System.out.println(array2.length);	// MS949 : 한글 1자 2byte
		System.out.println(array3.length);	// MS949 : 한글 1자 2byte
		System.out.println(array4.length);	// UTF-8 : 한글 1자 3byte
		
		//3. new String() : byte를 문자열로 변환
		
		String str1 = new String(array1);	// charset 생략
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949")); // 가져올떄 인코딩 타입이 일치해야한다 
		String str4 = new String(array4, Charset.forName("UTF-8"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("========================");
		//4. 한글이 깨지는 경우 : 내보내는 인코딩 타입과 가져오는 인코딩 타입이 일치하지 않을경우
		
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array2, Charset.forName("MS949"));
		String str7 = new String(array3, Charset.forName("UTF-8"));
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		
		
		
		
		
		
	}

}
