package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Ex04_FIleInputStream_2 {

	public static void main(String[] args) {
		File file1 = new File("src/chap19/Ex04/Exception-ms949.txt");
		
		// try with resource
		byte [] arr1 = new byte [100];
		int data;
		
		try(InputStream is1 = new FileInputStream(file1)) {
			
			while((data = is1.read(arr1)) != -1) {
				System.out.println(new String(arr1 , Charset.forName("MS949")));
			}
		} catch (IOException e) {
			System.out.println("예외 발생 ");
		}
		
		System.out.println("=========================");
		
		
		// try
		byte [] arr2 = new byte [100];
		int data2 ;
		InputStream is2 = null ;
		
		try {
			is2 = new FileInputStream(file1);
			while((data2 = is2.read(arr2)) != -1) {
				System.out.println(new String(arr2, Charset.forName("MS949")));
			}
		} catch (IOException e) {
			System.out.println("오류발생");
		}finally {
			try {
				if(is2 != null) {
				is2.close();
				}
			} catch (IOException e) {
				System.out.println("오류발생");
			}
		}
		
		
		
			
		

	}

}
