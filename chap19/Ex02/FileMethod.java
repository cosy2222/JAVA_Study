package chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		
		// 1. C:/에 작어폴더 생성 
		
		File tempdir = new File("C:/temp");
		if(! tempdir.exists()) {
			tempdir.mkdir();
		}
		
		//2. 파일객체 생성 (C:/windows)
		File file = new File("C:/windows");
		
		//3. 파일 메소드사용 
		System.out.println("절대 경로 출력 : " + file.getAbsolutePath());
		System.out.println("폴더의 존재유무 (?) : " + file.isDirectory());
		System.out.println("파일의 존재유무 (?) : " + file.isFile());
		System.out.println("파일/폴더 이름 출력 : " + file.getName()); // 파일,폴더 이름 
		System.out.println("부모 폴더 이름 : " + file.getParent()); // 부모폴더이름
		
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir()); // 폴더가 잘 생성된 경우 :true 
											  // 생성하지 못한 경우 : false
		System.out.println(newfile1.exists());
		
		File newfile2 = new File("C:/temp/bcd/cde");	// 하위의 폴더를 한꺼번에 생성하기 
		System.out.println(newfile2.mkdir());	// false , 하위폴더까지 한꺼번에 생성이 안된다
		System.out.println(newfile2.mkdirs());	// true , 하위폴더까지 한꺼번에 생성
		
		File newfile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newfile3.mkdirs());
		
		//4. File 객체를 사용해서 하위폴더의 정보추출
		 File [] fname = file.listFiles(); // file : "C:/windows" 하위의 모든 폴더나 파일의 이름을 배열에 저장
		
		for ( File k : fname) {
			System.out.println((k.isDirectory() ? "폴더 : " : "파일 :") + k.getName());
		}
		
		
		
		
		

	}

}
