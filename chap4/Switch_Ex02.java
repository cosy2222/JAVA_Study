package chap4;

public class Switch_Ex02 {

	public static void main(String[] args) {
		// Break를 처리 하지 않았을떄 : 해당 case로 이동한후 하위의 case를 다 실행한다
		int value1 = 2 ;
		switch ( value1) {
		case 1:
			System.out.println("A 학점");
		case 2:
			System.out.println("B 학점");
		case 3: 
			System.out.println("C 학점");
		default : 
			System.out.println("F 학점");
		}
		System.out.println();

		
		// 2.break 가 포함된 경우
		
		int value2 = 3 ;
		switch ( value2) {
		case 1:
			System.out.println("A 학점");
			break;
		case 2:
			System.out.println("B 학점");
			break;
		case 3: 
			System.out.println("C 학점");
			break;
		default : 
			System.out.println("F 학점");      // 마지막은 break를 생략해도 된다
		}
		System.out.println("========================");
		value2 = 2;
		
		if (value2 == 1) {
			System.out.println("A 학점 (if)");
		}
		else if (value2 ==2) {
			System.out.println("B 학점 (if)");
		}
		else if (value2==3) {
			System.out.println("C 학점 (if)");
		}
		else {
			System.out.println("F 학점 (if)");
		}
		
		
		/*
		 * switcd 문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail 을 출력
		 * 
		 */
		
		int a = 10;
		
		switch (a) {
		case 10 :
		case 9 :
		case 8 :
		case 7 :
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		
		}
		
		
		

	}

}
