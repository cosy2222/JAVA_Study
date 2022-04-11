package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 	1. is1   <== inputStream 객체	(절대경로로 접근 : ms949.txt)  	예외처리
 *	2. is2	 <== inputStream 객체 	(상대경로로 접근 : utf8.txt)	예외처리(try~ with resource로 예외처리)
 *				 close() 메소드를 자동으로 처리 
 *
 *	FileInputStream으로 읽어서 출력 
 * 
 */



public class Ex3_Exception1 {

	public static void main(String[] args) {
		
		// MS949
		
		File file1 = new File("src/chap19/Ex04/Exception-ms949.txt");
		InputStream is1 = null;
		int a = 0;
		
		try {
			is1 = new FileInputStream(file1);
			byte [] arr1 = is1.readAllBytes();
			System.out.println(new String(arr1 , "MS949"));
		} catch (IOException e) {
			System.out.println("예외발생");
		}finally {
			try {
				if(is1 != null) {
					is1.close();
				}
			} catch (IOException e) {
				System.out.println("예외 발생");
			}
		}
		
		System.out.println();
		System.out.println("===================================");
		
		// UTF-8
		
		File file2 = new File("src/chap19/Ex04/Exception-utf8.txt");
		InputStream is2 = null;
		int b = 0;
		
		try {
			
			is2 = new FileInputStream(file2);
			byte [] arr2 = is2.readAllBytes();
			System.out.println(new String(arr2 , "UTF-8"));
			
		} catch (IOException e) {
			System.out.println("예외 발생");
		}
		
		
		
		
		
		
		
		

	}

}
