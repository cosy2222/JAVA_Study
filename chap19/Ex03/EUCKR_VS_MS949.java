package chap19.Ex03;

import java.io.UnsupportedEncodingException;

// EUC-KR : 한국 표준, 한글표현가능   전체중 표기 가능한것만 구성되어 있음 . 약 11,000자 ---> 2200자 만 표기
	// 영문 : 1byte
	// 한글 : 2byte
	// 웹페이지로 출력 할떄 

// MS-949 : 마이크로소프트 에서 개발한 한글 표기방식 11,000자 모두 표기가능 windows OS
	// 영문 : 1byte
	// 한글 : 2byte

// UTF-8 : 모든서버  , git , Mac , linux    <가변 길이>
	// 영문 : 1byte
	// 한글 : 3byte

// UTF-16 :		<고정 길이> 
    // 영문 : 2byte
	// 한글 : 2byte

// 문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우 , 해당 인코딩 타입으로 조합을 해야 꺠어지지 않는다 

// 이클립스에서 인코딩 타입 설정 3가지.
	// 1. 전역 설정 :
	// 2. 프로젝트에서 설정 : 
	// 3. 파일에서 설정 : 
	
	// 우선순위 		파일 > 프로젝트 > 전역설정

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		
		// EUCKR_VS_MS949 
		
		//1. 영문자를 byte로 내보내고 String으로 변환 
		byte [] b1 = "a".getBytes("EUC-KR"); // 문자를 byte로 변환 ==> 네트워크로 문자를 byte스트림으로 변환해서 전송. 
			// 예외가 발생됨. UnsupportedEncodingException <== 오타가 발생할경우 인코딩 불가 예외
		byte [] b2 = "a".getBytes("MS949");  // 문자열 ==> byte[]
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "EUC-KR"));	// byte[] ==> 문자열로 바꿈 
		System.out.println(new String(b2, "MS949"));
		
		System.out.println();
		
		
		// 2. 한글을 byte로 내보내고 String 으로 가져오기
		byte [] b3 = "가".getBytes("EUC-KR");
		byte [] b4 = "가".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3, "EUC-KR"));	// byte[] ==> 문자열로 바꿈 
		System.out.println(new String(b4, "MS949"));
		
		
		//3.	EUC-KR : 현재 사용 가능한 것만 표기  약 2000자
		// 		MS949  : 11000자 모두 표기 
		byte [] b5 = "뷁".getBytes("EUC-KR");
		byte [] b6 = "뷁".getBytes("MS949");
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR"));	// byte[] ==> 문자열로 바꿈 
		System.out.println(new String(b6, "MS949"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
