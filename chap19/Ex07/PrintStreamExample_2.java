package chap19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamExample_2 {

	public static void main(String[] args) {
		
		// 파일 생성
		File f1 = new File("src\\chap19\\Ex07\\printStream3.txt");
		File f2 = new File("src\\chap19\\Ex07\\printStream4.txt");
		
		// 2.
		try(PrintStream ps = new PrintStream(f1);) {
			
			ps.println(5.8);	// double 출력
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d 이 호출되었습니다", 7);     // %d  : int값을 호출 
			ps.printf("%s %f" , "안녕" , 5.8);	  // %s : String   , %f : double
			
		} catch (FileNotFoundException e) {}
		
		try(InputStream is = new FileInputStream(f1);){
			int count;
			byte [] arr = new byte [100];
			count = is.read(arr);
			
			System.out.println(new String(arr , 0 , count , "UTF-8"));
			
		}catch(Exception e) {
			
		}
		
		
		

	}

}
