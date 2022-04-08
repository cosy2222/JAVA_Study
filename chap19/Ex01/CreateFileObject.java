package chap19.Ex01;

import java.io.File;
import java.io.IOException;

// 주의 : 이클립스에서 파일을 생성시 C:/ 에 생성할떄 권한문제로인한 오류발생가능 
//								이클립스를 관리자권한으로 실행하면 해결가능

// File객체내의 폴더식별자를 적용할 경우
	//  C:/abc/abc.txt



	// 1. Windows인 경우  : String path = "C:\\abc\\abc.txt"
	//	  windows10 	: String path = "C:/abc/abc.txt"


	// 2. MAC인 경우  : String path = "C:/abc/abc.txt"
	
	// 여러환경에서 호환가능
	// "C:" + File.separator + "temp001" + File.separator + "newfile03.txt"


public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		
		//1. File 객체를 사용해서 폴더생성. 해당 파일이나 폴더가 존재하지 않는경우 
		File tempdir = new File("C:/temp001");
		if(!tempdir.exists()) {	// 해당 경로에 파일이나 폴더가 존재하면 true,false
			tempdir.mkdir();	// 폴더생성 명령어
		}
		
		System.out.println(tempdir.exists());
		
		//2. File 객체를 사용해서 파일생성 
		File newfile = new File("C:/temp001/newfile.txt");	
		if(!newfile.exists()) {
			newfile.createNewFile();	// 예외처리 필요 
		}
		System.out.println(newfile.exists());
		System.out.println("============================");
		
		//3. 파일 구분자 
		File newfile2 = new File("C:\\temp001\\newfile01.txt");	// windows10 하위버전용
		File newfile3 = new File("C:/temp001/newfile02.txt");	//windows10 , Mac
		if(! newfile2.exists()) {
			newfile2.createNewFile();
		}
		if(! newfile3.exists()) {
			newfile3.createNewFile();
		}
		System.out.println(newfile2.exists());
		System.out.println(newfile3.exists());
		
		// 모든 OS에서 공통으로 식별가능한 코드
		File newfile4 = new File("C:" + File.separator + "temp001" + File.separator + "newfile03.txt");
		if(! newfile4.exists()) {
			newfile4.createNewFile();
		}
		System.out.println(newfile4.exists());
		
		//4.절대경로로 처리 : 다른 시스템으로 이동된 경우 그 시스템 환경에 맞도록 셋팅이 필요
		File newfile5 = new File("C:/temp001/newfile05.txt");	// 절대경로로 처리
		System.out.println(newfile5.getAbsolutePath());	 // file객체에 저장된 파일의 절대경로를 출력
		
		//5.상대경로로 처리  <== 권장사항 
		// 현재 나의 작업폴더의 위치를 알아야한다 
		System.out.println(System.getProperty("user.dir")); //현재 작업 폴더의 위치 
				// 이클립스 실행 폴더 위치
		
		File newfile6 = new File("newFile06.txt");	// 상대경로
		System.out.println(newfile6.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
