package Ex;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int value;
		
		int a = sca.nextInt();
		
		System.out.println( "�ݾ��� �Է��Ͻÿ� >> ");
		
		for(int i = 0 ; i < unit.length ; i++) {
			value = a / unit[i];
			a = a % unit[i] ;
			System.out.println( unit[i] + " �� ¥�� : " + value + " �� " );
		}
		

	}

}
