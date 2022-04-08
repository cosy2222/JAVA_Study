package practice;

import java.util.Arrays;

public class Practice04 {

	public static void main(String[] args) {
		
		int arr2 [] = new int [300];
		int num1 = 0;
		
		for( int i =0 ; i < arr2.length ; i++) {
			num1 = i + 1;
			arr2[i] = num1 * 3; 
		}
		
		//for 문으로 출력
		for( int i = 0 ; i < arr2.length ; i++) {
			System.out.println(i + "번쨰방의 값 : " + arr2[i]);
		}
		
		
		// 향상된 for 문 으로 출력
		System.out.println("============향상된 for문 ==================");
		
		for ( int i : arr2) {
			System.out.println(i);
		}
		
		// Arrays.toString 으로 출력
		System.out.println("====================Arrays.toString==========================");
		System.out.println(Arrays.toString(arr2));
		
		
		
		// 홀수번방의 값만 출력 
		System.out.println("=========홀수번방의 값만 출력=================");
		for(int i = 100 ; i < arr2.length ; i++) {
			if( i %2  == 0) {
				continue;
			}
			
			System.out.println(i + "번쨰방의 값 : " + arr2[i]);
		}
			

	}

}
