package chap19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
	Reader / Writer : 추상클래스 , char를 처리 , 문자 O , 이미지 X , MP3 X
	FileReader / FileWriter : 완성된 클래스 , Default charset 만 사용
	InputStreamReader / InputStreamWriter : 읽을떄 인코딩  지정해서 읽기 , 쓰기도 인코딩 지정해서 쓰기 
	
	System.in : 콘솔에서 입력 ,  System.out : 콘솔에 출력  <== Application에서 한번 close()되면 재사용 불가
	
	
*/
public class OutputStreamWriter_2 {

	public static void main(String[] args) {
		
		// 1.  콘솔 출력 (Default : MS949)
		
		try {
			OutputStreamWriter writer = new OutputStreamWriter(System.out , "MS949");
			
			writer.write("OutputStreamWriter 예제 파일입니다. \n".toCharArray());    // String을 char배열에 저장 
			writer.write("한글과 영문이 모두 포함");  // String
			writer.write('\n');
			writer.write("Good bye !!!! \n\n");
			writer.flush();
			
		} catch (Exception e) {}
		
		System.out.println("========================= ");
		
		// 2. 콘솔처리 ( Default : MS949 ==> UTF-8 )
		
		try {
			OutputStreamWriter writer = new OutputStreamWriter(System.out , "UTF-8");
			
			writer.write("OutputStreamWriter 예제 파일입니다. \n".toCharArray());    // String을 char배열에 저장 
			writer.write("한글과 영문이 모두 포함");  // String
			writer.write('\n');
			writer.write("Good bye !!!! \n\n");
			writer.flush();
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		

	}

}
