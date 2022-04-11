package chap19.Ex04;

/*
 *  ASCII 코드값 출력 : 1byte = 8bit , 제일 처음비트는 부호 비트   7bit만 사용가능
 *  	1 ~ 32 비트 까지는 : 출력을 할수없는 특수한 코드가 들어가있다.   예) null , 헤더의시작 , 경고음(7) , 개행(10)
 *  	127 : delete
 *  	
 *  	실제 출력 가능은 33번비트 ~ 126번비트
 *  	영문 , 숫자 , 특수문자 
 *  
 *  	출력
 *  	=====================================
 *  	ASCII	  문자		ASCII		문자
 *  	=====================================
 *  	33  	   !		  34		&
 * 
 */



public class Ascii_Code_Print {

	public static void main(String[] args) {
		
		System.out.println("=====================================");
		System.out.println("ASCII	 문자	      ASCII	 문자");
		System.out.println("=====================================");
		
		for(int i = 33 ; i < 127 ; i++) {
			if( i %2 != 0) {
				System.out.print(i + "        " + (char)i + "            ");
			}
			if( i %2 ==0) {
				System.out.println(i + "       " + (char)i);
			}
		}
	}

}
