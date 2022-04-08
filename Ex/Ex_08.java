package Ex;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int value;
		
		int a = sca.nextInt();
		
		System.out.println( "금액을 입력하시오 >> ");
		
		for(int i = 0 ; i < unit.length ; i++) {
			value = a / unit[i];
			a = a % unit[i] ;
			System.out.println( unit[i] + " 원 짜리 : " + value + " 개 " );
		}
		

	}

}
