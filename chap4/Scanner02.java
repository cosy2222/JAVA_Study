package chap4;                           // If ���

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		System.out.println("�����ڸ� �Է� �ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		char sca = scanner.next().charAt(0);
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		if (sca == '+') {
			result = num1 + num2;
		}
		else if (sca == '-'){
			result = num1 - num2 ;
		}
		else if (sca == '*') {
			result = num1 * num2;
		}
		else if (sca == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("�߸��� ������ �Դϴ�");
			return;
		}
		System.out.println("��� �� : " + result + "�Դϴ�");
		
		
		
	}

}
