package chap05;

import java.util.Arrays;

public class MethodOfString_02 {

	public static void main(String[] args) {
		// 5 문자열 수정
		// toLowerCase() : 소문자로 변환 ,  toUpperCase() : 대문자로 변환
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println("========================");
		
		
		//replace(old,new)  : old의 값을 new 로 변환
		System.out.println(str1.replace("Study", "공부" ));  //Java 공부
		
		//substring(시작index , 자를 마지막 index 앞까지 )    : 문자열을 잘라서 출력
		System.out.println(str1.substring(0,5));     // Java
		System.out.println(str1.substring(6,8));     // tu
		

		//split(): 특정 문자를 기준으로 잘라서 String[] 배열에 저장
		String str11 = "abc/def-ghi jk1";
		String [] strarray = str11.split("/|-| ");    //   '/' 또는 '-' 또는 '공백'
		System.out.println(Arrays.toString(strarray));
		
		String str111 = "오늘의 날씨는 흐립니다." ;
		String [] strarray2 = str111.split(" ");     // 공백을 기준으로 str2array 배열에 저장
		System.out.println(Arrays.toString(strarray2));
		
		String str1111 = "이름-나이-성별-전화번호-메일주소";
		String [] strarray3 = str1111.split("-");
		System.out.println(Arrays.toString(strarray3));
		for (int i = 0 ; i <strarray3.length ; i++) {
			System.out.print(strarray3[i]);
		}
		System.out.println();
		
		//trim() : 앞뒤의 공백을 제거함.
		System.out.println("           abc         ");
		System.out.println("           abc        ".trim());
		System.out.println();
		
		
		//6. 문자열의 내용 비교 .equals() : 대소문자를 구분하면서 값을 비교   ,  .equalsIgnoreCase() : 대소문자 구별없이 값을 비교 
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//메모리의 주소값 비교 (==) 
		System.out.println(str2==str3);     // false
		System.out.println(str3==str4);     // false
		System.out.println(str4==str2);     // false
		System.out.println("=====================");
		
		// 값을 비교   .equals()   ,    .equalsIgnoreCase
		System.out.println(str2.equals(str3));      // true 대소문자 구분
		System.out.println(str3.equals(str4));      // false
		System.out.println(str4.equalsIgnoreCase(str2));    // true 대소문자 구분없이 비교 
		
		
		
		
		
		
		
			
		
	}

}
