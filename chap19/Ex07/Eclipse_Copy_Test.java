package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		
		File f = new File ("C:\\temp\\eclipse_origin.exe");   // 원본 파일
		File cf1 = new File ("C:\\temp\\eclipse_copy1.exe");   // Buffered를 사용하지 않고 처리하는 경우
		File cf2 = new File ("C:\\temp\\eclipse_copy2.exe");   // Buffered를 사용한 경우 
		
		
		// 성능 측정을 하기위한 변수 선언
		
		long start , end , time1, time2;     // time1 : Buffered X    time2: Buffered O
		
		
		// 1. Buffered 를 사용하지않고 처리하는 경우 
		start = System.nanoTime();     //시작시간
		
		try (
				InputStream is = new FileInputStream(f);
				OutputStream os = new FileOutputStream(cf1)	  // Auto close()
				){
			// 데이터 복사 코드 생성
			int data;
			while((data=is.read()) != -1) {
				os.write(data);
			}
			
			
		} catch (IOException e) {}
		
		end = System.nanoTime();
		
		time1 = end - start;
		System.out.println("with out BufferedxxxStream : " + time1);	//버퍼 미사용
		
		
		//2. Buffered를 사용하면서 처리하는 경우 ( BufferedInputStream , BufferedOutputStream)
		
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(cf2);		
			BufferedOutputStream bos = new BufferedOutputStream(os);
				) {
			// 복사할 코드 생성 
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		
		time2 = end - start;
		System.out.println("with BufferedxxxStream : " + time2);	// 버퍼 사용
		
		
		//   time1 : 버퍼 미사용   ,   time2 : 버퍼 사용
		System.out.println(time1/time2);

	}

}
