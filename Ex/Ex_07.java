package Ex;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		System.out.println("양의 정수 10개를 입력하시오");
		Scanner sca = new Scanner(System.in);
		
		int [] array = new int [10]  ;
		int [] array1 = new int [10] ;
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = sca.nextInt();
			if(array[i] %3 == 0) {
				array1[i] = array[i];
			}
		}
		
		System.out.print("3의 배수는 : ");
		for( int j = 0; j < array1.length ; j++) {
			if(array[j] %3 == 0) {
				System.out.print(array1[j] + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
