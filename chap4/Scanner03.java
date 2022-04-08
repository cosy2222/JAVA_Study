package chap4;                   // Switch  사용 

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		System.out.println("연산자를 입력 하세요");
		Scanner scanner = new Scanner(System.in);
		char sca = scanner.next().charAt(0);
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		switch ( sca ) {
		case '+':
			result = num1 + num2;
			System.out.println("결과 값은 :" + result + "입니다");
			break;
		case '-':
			result = num1 - num2;
			System.out.println("결과 값은 :" + result + "입니다");
			break;
		case '*':
			result = num1 * num2;
			System.out.println("결과 값은 :" + result + "입니다");
			break;
		case '/':
			result = num1 / num2;
			System.out.println("결과 값은 :" + result + "입니다");
			break;
		default:
			System.out.println("잘못된 연산자 입니다");
		
			
		}
		
	}

}
