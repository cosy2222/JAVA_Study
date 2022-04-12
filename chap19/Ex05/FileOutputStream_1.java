package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// InputStream : 추상클래스   <== FileInputStream 추상클래스를 구현한 클래스		읽어올떄
// OutputStream : 추상크래스  <== FileOutputSteam 추상클래스를 구현한 클래스 		쓰기

// FileInputStream : byte() 단위 데이터 읽기.
// FileOutputStream : byte() 단위 데이터 쓰기 

// windows 콘솔 , 메모장 enter를 넣으면 : \r\n
// MAC  : \n


public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		
		//  1.  입력 파일 생성 (존재하지않음)
		File outFile = new File("src/chap19/Ex05/FileOutput1.txt");
		
		// 2.  byte쓰기
		OutputStream os1 = new FileOutputStream(outFile) ;
			// FileOutputStream에 존재하지 않는 파일을 넣으면 실행시 생성됨
			// FileOutputStream 경로에 파일이 존재해야됨 , 예외발생
		
		os1.write('J');				// wirte : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');	//13	<==생략가능
		os1.write('\n');	//10  엔터
		
			// 중요 : write() 메소드는 버퍼(RAM)에 쓰기  , 버퍼가 꽉차면 파일에 쓰기
			// 		 flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기 할떄 사용
		
		os1.flush();  // 버퍼가 꽉차지 않더라도 강제로 파일에 쓰기를 한다 <== 생략가능  wirte()를 사용하면 flush()를 사용하기를 권장
		os1.close();  // close() 호출시 flush()먼저 작동됨
		
		
		// 3.  n-byte 단위 쓰기 (byte[]의 offset부터 length개의 byte 데이터 쓰기 )
		OutputStream os2 = new FileOutputStream(outFile ) ;		// false :덮어쓰기    true : 이어쓰기	
								// FileOutputStream (File o , boolean)	// boolean 생략하면 기본값으로 false
		byte [] arr1 = "Hello!".getBytes();
		
		os2.write(arr1);
		os2.write('\n'); 	//  \r은 생략 가능 ,  \n만 넣어도 windows에서 enter처리 가능
		
		os2.flush();
		os2.close();
		
		
		// 4. n-byte 단위 쓰기 ( byte[] 의 offset부터 length개의 byte데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile , true) ;	//이어쓰기
		byte [] arr2 = "better the last smile than the first laugther".getBytes();
		os3.write(arr2 , 7 , 8);
		
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
