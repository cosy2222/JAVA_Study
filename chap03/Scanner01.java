package chap03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		System.out.println("�������� �Է��ϼ���?");
		Scanner scanner = new Scanner(System.in);
		
		int value1 = scanner.nextInt();
		if (value1 % 3 == 0) {
			System.out.println("3�� ��� �Դϴ�");  
			}
		else {
			System.out.println("3�� ����� �ƴմϴ�");
		}
		
	}

}
