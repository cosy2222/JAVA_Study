package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
	System.in : console에서 인풋을 받는 객체  , InputStream
	System.out : console로 출력을 하는 객체 , outputStream
*/
public class ConsoleInputObject_1_1 {

	public static void main(String[] args) throws IOException {
		
		// 1. console 에서 인풋 받기위한 객체 생성
		InputStream is1 = System.in;    // is1은 콘솔에서 인풋 받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요 >>>");
		
		int data;
		
		while((data = is1.read()) != '\n') {
			System.out.print( (char)data );
		}
		
		System.out.println(data);			// 13  <==  \r
		System.out.println(is1.read());		// 10  <==  \n
		
		
		

	}

}
