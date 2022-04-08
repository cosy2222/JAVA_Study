package chap19.Ex03;

import java.nio.charset.Charset;  // Charset 클래스

public class CreateChasetObject {

	public static void main(String[] args) {
		
		// 문자 인코딩 설정을 적용하는 방법  
		//1. Charset.defaultCharset()  <== 시스템의 기본설정을 로드 (인코딩 타입)
		
		Charset cs1 = Charset.defaultCharset(); // 정적 메소드 , 시스템의 기본 설정된 charset을 로드
		
		System.out.println(cs1); 	//MS949 --> x-windwos949 (MS949의 확장)
									// UTF-8
		
		//2. Charset.forName("MS949")  <== 직접할당해서 사용
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);

	}

}
