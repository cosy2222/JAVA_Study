package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {
		
		// 1. 입력파일 생성
		File inFile = new File ("src/chap19/Ex04/FileInputStream1.txt");
		
		
		
		// 2. byte 단위 읽기  (한 바이트씩 읽어서 처리)
		InputStream is1 = null;
		
		try {
			is1 = new FileInputStream(inFile);
			int data;
			while((data = is1.read()) != -1) {		// 영문만 있으므로 read() 메소드만 사용 , 한글일 경우 read(byte배열)
				System.out.print((char)data);
			}	
		}catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다");
		}finally {
			if(is1 != null) {
				try {
					is1.close();
				} catch (IOException e) {
				}
			}
		}
		
		System.out.println();
		System.out.println("==============================");
		
		// 3. try (with resource) {} 로 구현
		
		
		try(InputStream is1_1 = new FileInputStream(inFile);) {
			// try(with resource : 객체 생성) <== close()가 자동으로 된다 FileInputStream은 Closeable인터페이스를 구현 
			int data;
			while((data = is1_1.read()) != -1) {		// 영문만 있으므로 read() 메소드만 사용 , 한글일 경우 read(byte배열)
				System.out.print((char)data);
			}	
		}catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다");
		}
		
		
		System.out.println();
		System.out.println("========================");
		//4. n-byte 단위 로 읽기 (byte[]의 처음위치에서 부터 읽은 데이터 저장)	: 여러 바이트를 동시에 읽어서 처리속도가 빠름
					// 배열의 방의 크기만큼 읽어서 byte배열에 저장
					// 한글처리가능 
	
		
		InputStream is2 = new FileInputStream(inFile);
		byte [] arr1 = new byte[5];
		int count1 ;
		
		while(   (count1 = is2.read(arr1)) != -1   ) {
					  	   // is2.read() : 1byte 씩 읽는다		// 한글을 처리 못한다
						   // is2.read(bytearr) : 9byte씩 읽는다
			
			
			for(int i = 0 ; i < count1 ; i++) {
				System.out.print((char)arr1[i]);
			}
			System.out.println(" : count1 = " +count1);
			
			String str = new String (arr1 , Charset.forName("MS949"));
			
		}
		
		is2.close();
		
		
		
		// 4-2.  n-byte단위로 읽어서 한글 처리 [배열단위로 읽어서 한글처리]

		InputStream is3 = new FileInputStream(inFile);
		byte[] arr2 = new byte[100];
		
		int count2;
		
		while((count2 = is3.read(arr2)) != -1) {
			System.out.println(new String (arr2 , Charset.forName("MS949")));
			
		}
		
		System.out.println("===========================");
		
		
		//  4-3.  n-byte 단위로 읽어서 저장.  offset , length 사용
		
		InputStream is4 = new FileInputStream(inFile);
		byte [] arr3 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is4.read(arr3 , offset , length);	// length만큼 앞에서 읽어와서 arr3 에 offset위치에 저장
		
		for ( int i = 0 ; i < offset+count4 ; i++ ) {
			System.out.print((char)arr3[i]);
		}
				
		is4.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
