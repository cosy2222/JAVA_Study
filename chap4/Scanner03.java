package chap4;                   // Switch  ��� 

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		System.out.println("�����ڸ� �Է� �ϼ���");
		Scanner scanner = new Scanner(System.in);
		char sca = scanner.next().charAt(0);
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		switch ( sca ) {
		case '+':
			result = num1 + num2;
			System.out.println("��� ���� :" + result + "�Դϴ�");
			break;
		case '-':
			result = num1 - num2;
			System.out.println("��� ���� :" + result + "�Դϴ�");
			break;
		case '*':
			result = num1 * num2;
			System.out.println("��� ���� :" + result + "�Դϴ�");
			break;
		case '/':
			result = num1 / num2;
			System.out.println("��� ���� :" + result + "�Դϴ�");
			break;
		default:
			System.out.println("�߸��� ������ �Դϴ�");
		
			
		}
		
	}

}
