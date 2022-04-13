package chap19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		//1. 콘솔 입력 (MS949) : default charset , byte 스트림
		
		try(InputStreamReader isr = new InputStreamReader(System.in , "MS949")){
			
			// isr은 변환된 char
			
			System.out.println("한글을 입력하세요");
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
			
		}catch(Exception e) {}
		
		
		// 콘솔 입력 (UTF 8 )
		
			try(InputStreamReader isr = new InputStreamReader(System.in , "UTF-8")){
			
			// isr은 변환된 char
			
			System.out.println("한글을 입력하세요");
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
			
		}catch(Exception e) {}
		

	}

}
