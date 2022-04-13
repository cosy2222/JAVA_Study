package chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

// PrintStream : Filter Stream ( 추가기능을 제공하는 Stream ) , 기반 스트림이 필요 
	// 다양한 방법으로 출력에 특화된 스트림이다.  flush()를 호출하지 않아도 자동으로 flush()
	// println() , print() , printf()
	// 파일 출력 ,  콘솔 출력 , ....

public class PrintStreamExample {

	public static void main(String[] args) {
		
		// 파일 객체 생성
		File f1 = new File("src\\chap19\\Ex07\\printStream1.txt");
		File f2 = new File("src\\chap19\\Ex07\\printStream2.txt");
		
		//2. printStream (FileOutputStream(File))
		
		try(OutputStream os1 = new FileOutputStream(f1);
			PrintStream ps = new PrintStream(os1);) {	// Filter스트림(추가기능을 제공) ,  기반스트림이 필요
			
			ps.println(5.8);	// double 출력
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d 이 호출되었습니다", 7);     // %d  : int값을 호출 
			ps.printf("%s %f" , "안녕" , 5.8);	  // %s : String   , %f : double
			
			//ps.flush()   <== 자동호출
		} catch (IOException e) {}
		
		// 3. printStream(File)
		
		try (PrintStream ps = new PrintStream(f2);){
			
			ps.println(5.8);	// double 출력
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d 이 호출되었습니다", 7);     // %d  : int값을 호출 
			ps.printf("%s %f" , "안녕" , 5.8);	  // %s : String   , %f : double
			
		} catch (FileNotFoundException e) {}
		
		// 4. 콘솔에 출력 1
		try(OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);){
			
			ps.println(5.8);	// double 출력
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d 이 호출되었습니다", 7);     // %d  : int값을 호출 
			ps.printf("%s %f" , "안녕" , 5.8);	  // %s : String   , %f : double
			
		}catch(Exception e) {}
		
		System.out.println("=========================");
		
		// 5. 콘솔에 출력 2
		try( PrintStream ps = System.out;){
			
			ps.println(5.8);	// double 출력
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d 이 호출되었습니다", 7);     // %d  : int값을 호출 
			ps.printf("%s %f" , "안녕" , 5.8);	  // %s : String   , %f : double
			
		}catch(Exception e) {}
		
		
		

	}

}
