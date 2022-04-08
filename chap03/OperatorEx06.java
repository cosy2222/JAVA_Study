package chap03;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		/*
		 * 논리 쉬프트를 이용해서 각 비트의 위치의 값을 알아내기
		 */
		
		int flags =0b10110110 ;
		System.out.println(flags >>> 0 & 1);  // 0 : 0번쨰 비트값이 출력
		System.out.println(flags >>> 1 & 1);  // 1 : 1번쨰 비트값이 출력
		System.out.println(flags >>> 2 & 1);  // 1 : 2번쨰 비트값이 출력
		System.out.println(flags >>> 3 & 1);  // 0 : 3번쨰 비트값이 출력
		System.out.println(flags >>> 4 & 1);  // 1 : 4번쨰 비트값이 출력
		System.out.println(flags >>> 5 & 1);  // 1 : 5번쨰 비트값이 출력
		System.out.println(flags >>> 6 & 1);  // 0 : 6번쨰 비트값이 출력
		System.out.println(flags >>> 7 & 1);  // 1 : 7번쨰 비트값이 출력
	}

}
