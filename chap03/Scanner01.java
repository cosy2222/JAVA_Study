package chap03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		System.out.println("정수값을 입력하세요?");
		Scanner scanner = new Scanner(System.in);
		
		int value1 = scanner.nextInt();
		if (value1 % 3 == 0) {
			System.out.println("3의 배수 입니다");  
			}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		
	}

}
