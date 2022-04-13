package chap19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// InputStream : 기반 스트림
	//  Int ==> 5555(문자) ==> 5555(문자) === > int


// DataInputStream : 추가기능을 제공하는 스트림 , 기반스트림이반드시 존재 , 단독으로 사용할 수 없다
		// 다양한 포맷의 데이터를 빠르게 전송할떄 사용

public class DataInputStream_1 {

	public static void main(String[] args) {
		
		// 파일생성 
		File df = new File ("src\\chap19\\Ex07\\file1.data");

		
		// 데이터 쓰기
		try (	OutputStream os = new FileOutputStream(df);
				DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			
		}catch(IOException e) {} 
		
		
		// 데이터 읽기 (DataInputStream)
		
		try (
				InputStream is = new FileInputStream(df);
				DataInputStream dis = new DataInputStream(is);
				){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
