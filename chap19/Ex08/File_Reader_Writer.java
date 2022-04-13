package chap19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
	Reader / Writer  : char 단위 입출력	, 문자만 처리
		// byte : 1byte
		// char : 2byte , UTF-16 (유니코드)로 처리 ,  영문 2byte , 한글도2byte , 고정길이 , 전세계 모든언어를 처리 
		  
		FileReader : charSet 지정 옵션이 없다  , default charset 사용
		FIleWriter : charSet 지정 옵션이 없다  , default charset 사용
		 
	
*/

public class File_Reader_Writer {

	public static void main(String[] args) {
		
		//1. 파일객체 생성
		File rwfile = new File ("src\\chap19\\Ex08\\rwfile_utf8.txt");
		
		try (Writer writer = new FileWriter(rwfile);){  // Writer : 추상클래수 , FileWriter : Writer 을 구현한 자식클래스
			// OutputStream : byte 단위 출력 , 추상클래스 , FileOutputStream   ,  문자,데이터,MP3,AVG .... 모든처리 
			// Writer       : char 단위 출력 , 추상클래스 , FileWriter  ,   문자특화해서 처리
			
			writer.write("안녕하세요\n".toCharArray());  // String ==> char배열에 저장
			writer.write("hello");   //String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다" , 2, 3);
			writer.flush();
			
		} catch (IOException e) {}
		
		
		// 2.FileReader를 이용한 파일 읽기 (Default UTF-8)   <=== charactorSet 지정 옵션이 없다 
		
		try (Reader reader = new FileReader(rwfile);){
			
			int data;
			while((data=reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
