package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {
		
		//현재작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		//1. 입력 파일 생성
			// 절대경로로 설정
		File inFile1 = new File ("D:\\ksm\\JAVA\\kosmo_ksm\\src\\chap19\\Files\\FileInputStream1.txt");
		
			// 상대경로로 설정 : 현재 작업디레토리를 기준으로 설정
		File inFile = new File("src\\chap19\\Files\\FileInputStream1.txt");
		
		// InputStream 객체를 생성해야 파일의 내용을 읽을수 있다.
		InputStream is = new FileInputStream(inFile);
			//InputStream은 추상클래스 , 직접객체생성을 할 수 없다 타입지정은 가능
		
		// Java에서 줄바꿈 처리
		//   -UNIX : \n
		//   -Windows : \r\n      <==  \r 은 생략 가능
		//   -MAC     :  \r  
		

		
		
		// 한 바이트 데이터를 읽어서 char로 변환후 출력
		System.out.print((char)is.read()); 	// read() 한바이트를 읽어들임 
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		System.out.println();
		System.out.println("=============================");
		
		// 스트림은 값을 읽으면 메모리에서 삭제 된다. 새로 읽기 위해서는 새로운 스트림을 생성 해야 한다 
		
		
		// int read() : 한 바이트를 읽어서 정수타입으로 리턴 , 읽은 데이터가 값이 존재하지않을경우 -1리턴
		// While문을 사용해서 한번에 출력
		InputStream is1 = new FileInputStream(inFile);
		
		int data ; 
		
		while ((data = is1.read()) != -1) {	// 마지막값까지 계속 순환
			System.out.print((char) data);
		}
			// ! 중요 : read() : 1byte를 읽어들임  반환타입은 int 다 
			// FileInputStream은 반드시 index 0번부터 읽어들임
				// FileRandomAccess 를 사용해서 임의의 index에서 읽어들임
		
		System.out.println();
		System.out.println();
		System.out.println("====================");
		
		InputStream is2 = new FileInputStream(inFile);
		
		while ((data = is2.read()) != -1) {	// 마지막값까지 계속 순환      (값이존재하지않으면 -1리턴)
			System.out.println("읽은 데이터 : " + (char) data + ", 남은 바이트 수 : " + is2.available());
		}
		
		is.close();
		is1.close();
		is2.close();

	}

}
