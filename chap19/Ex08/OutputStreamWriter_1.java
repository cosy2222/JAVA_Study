package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// InputstreamReader : byte ==> char   , charset 지정해서 파일을 읽어올 수 있다 
// OutputStreamWriter : byte ==> char  , charSet 지정해서 파일을 저장할 수 있다 

public class OutputStreamWriter_1 {

	public static void main(String[] args) {
		
		//1. FileWriter를 통해서 데이터 쓰기 ( default , MS949 )
		File osw1 = new File ("src\\chap19\\Ex08\\osw1.txt");   // MS949
		File osw2 = new File ("src\\chap19\\Ex08\\osw2.txt");	// UTF8
		
		try(Writer writer = new FileWriter(osw1); ){
			
			writer.write("OutputStreamWriter 예제 파일입니다. \n".toCharArray());    // String을 char배열에 저장 
			writer.write("한글과 영문이 모두 포함");  // String
			writer.write('\n');
			writer.write("Good bye !!!! \n\n");
			writer.flush();
			
		} catch (IOException e) {}
			
		//2. FileWriter를 사용해서 ( default : MS949 === > UTF-8 파일 쓰기 )
		
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os , "UTF-8"); ){
			
			osw.write("OutputStreamWriter 예제 파일입니다. \n".toCharArray());    // String을 char배열에 저장 
			osw.write("한글과 영문이 모두 포함");  // String
			osw.write('\n');
			osw.write("Good bye !!!! \n\n");
			osw.flush();
			
		} catch (IOException e) {}
			
			
			
		

	}

}
