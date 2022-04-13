package chap19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		// 1. 파일 생성 
		File rwfile = new File("src\\chap19\\Ex08\\Bufferedfile.txt");
		
		
		// 2. FileWriter를 이용한 파일 쓰기 (MS949 모드)
		
		try(Writer writer = new FileWriter(rwfile);
			BufferedWriter bw = new BufferedWriter(writer);  ){
			
			bw.write("안녕하세요\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다" , 2, 3);
			bw.flush();
			
		}catch(Exception e) {}
		
		
		// 3. FileReader를 이요한 파일쓰기 (MS949 모드)
		
		try(Reader reader = new FileReader(rwfile);
			BufferedReader br = new BufferedReader(reader);	 ){
			
			//BufferedReader 에 추가됨 네소드 : String.readLine() , 한라인씩 읽는다    파일의 끝 = null
			// int read : 한바이트씩 읽는다 , 파일의끝 = -1
			
			String data ;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
