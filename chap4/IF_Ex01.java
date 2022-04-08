package chap4;

public class IF_Ex01 {

	public static void main(String[] args) {
		
		// If문 :
		/*
		 *  if (조건) {
		 *    조건이 참일떄 실행될 코드 ;
		 *  }  
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1 : 조건이 참일떄 실행");
		}
		
		/*
		 * if (조건) {
		 *        조건이 참일떄 실행할 문장 ; 
		 *  }
		 * else {
		 *    조건이 거짓일떄 실행할 문장 ;
		 *  }
		 */
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		if (bol1) {
			System.out.println("실행2");
		}
		else {
			System.out.println("실행3");
		}
		
		if (bol2) {
			System.out.println("실행4");
		}
		else {
			System.out.println("실행5");
		}
		System.out.println("======================");
		
		System.out.println( (bol1) ? "실행6" : "실행7");
		System.out.println( (bol2) ? "실행8" : "실행9");
		
		
		/*
		 * if의 조건이 여러 개일떄 ?
		 * 
		 * if (조건1) {
		 *  	조건1이 참일떄 실행 코드 ;
		 * }
		 * else if (조건2) {
		 * 		조건2가 참일떄 실행 코드 ;
		 * }
		 * else if (조건3) {
		 * 		조건 3이 참일떄 실행코드; 
		 * } 
		 * else {
		 *		모든 조건이 거짓일떄 실행코드 ;
		 * }  
		 */
		
		int value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A 학점, 점수 :" + value3);
		}
		else if (value3 >= 80) {
			System.out.println("B 학점, 점수 : " + value3);
		}
		else if (value3 >= 70 ) {
			System.out.println("C 학점, 점수 : " + value3);
		}
		else {
			System.out.println("F 학점, 점수 :" + value3);
		}
		System.out.println();
		
		
		/*
		 * IF 문에서 조건의 순서가 바뀌어 있을 경우
		 */
		
		if (value3 >= 90) {
			System.out.println("A 학점, 점수 :" + value3);
		}
		else if (value3 >= 70 ) {
			System.out.println("C 학점, 점수 : " + value3);      // 실행후에 if 문을 빠져 나온다
		}
		else if (value3 >= 80) {
			System.out.println("B 학점, 점수 : " + value3);
		}
		else {
			System.out.println("F 학점, 점수 :" + value3);
		}
		System.out.println();
		
		/*
		 * 조건을 부여 할떄 세밀 하게 적용
		 * 
		 */
		value3 = 85;
		if ( value3 <=100 && value3 >= 90) {
			System.out.println(" A 학점 입니다");
		}
		else if ( value3 <80 && value3 >=70) {
			System.out.println(" C 학점 입니다");
		}
		else if ( value3 <90 && value3 >=80) {
			System.out.println(" B 학점 입니다");
		}
		else {
			System.out.println(" F 학점 입니다");
		}
		System.out.println("============================");
		/*
		 * if 문에서 실행문이 하나일떄 의 {}를 생략 할 수 있다 
		 */
		
		if ( 3 < 5 )
			System.out.println("안녕하세요");    // if에서 {} 가 생랴괸 경우
		System.out.println("============================");
		
		if ( 3 > 5 )
			System.out.println("안녕하세요 2");
		    System.out.println(" 반갑습니다.");
		
		
		
		

	}

}
