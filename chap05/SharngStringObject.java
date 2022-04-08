package chap05;

public class SharngStringObject {

	public static void main(String[] args) {
		
		// 1 문자열 객체 공유 ( 리터럴로 생성한 경우) new 키워드로 생성한 경우 ( 별도의 공간에 생성)
		
		String str1 = new String ("안녕");       // new 생성 하면 : RAM을 공유 하지 않는다 .
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String ("안녕");
		
		// 각 변수의 메모리 주소 비교 (==)
		System.out.println(str1 == str2);   //false
		System.out.println(str2 == str3);   //true
		System.out.println(str3 == str4);    //false
		System.out.println(str4 == str1);    //false
		
		System.out.println("===================");
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str1));
		

	}

}
