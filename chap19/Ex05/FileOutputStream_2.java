package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// FileInputStream을 사용해서 한글 처리

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		
		
		// 1. 저장할 파일 생성
		File outFile  = new File("src/chap19/Ex05/FileOutput2.txt"); // 기본적으로 이큽립스의 default characterSet으로 저장
		
		// 2. n-byte 단위 쓰기 처리 ( byte[] 의 처음부터 끝까지 쓰기) <== 한글을 처리
		OutputStream os1 = new FileOutputStream(outFile);
		byte [] arr1 = "안녕하세요".getBytes(Charset.forName("MS949"));	
		
		os1.write(arr1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
		
		
		// 3. n-byte 쓰기  ( byte[] 의 offset부터 length개의 바이트 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile , true);
		byte [] arr2 = "반갑습니다".getBytes(Charset.forName("MS949"));
		
		os2.write(arr2 , 2 , 4);
		os2.write('\n');
		
		
		os2.flush();
		os2.close();
		
		
		
		
		
	}

}
