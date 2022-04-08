package practice;

import java.util.Arrays;

public class Practice03 {

	public static void main(String[] args) {
		
		int [] arr1 = new int [100];
		int num1 = 0;
		
	
		for(int i = 0 ; i < arr1.length ; i++) {
			num1 = i + 1;
			arr1[i] = num1;
			System.out.println(arr1[i]);
		}
		
		System.out.println("================Çü»óµÈ for==================");
		for( int i : arr1) {
			System.out.println(i);
		}
		
		System.out.println("=================<< Arrays.toString>>============");
		System.out.println(Arrays.toString(arr1));
		
					
		
				
				
	
		
		
		
		
		
	}

}
