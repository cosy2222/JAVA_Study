package practice;

import java.util.Scanner;

public class Ex00 {
	
	static void Arr(int a[]) {
		
		Scanner sca = new Scanner(System.in);
		
		
		
		int k = 0 ;
		for(int i = 0 ; i < a.length ; i ++) {
			k += a[i];
		}
		System.out.println("Че :" + k);
		System.out.println("ЦђБе : " +  (double)k/a.length );
		
	}
    
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);

		int [] a = new int [10] ;
		
		for(int i = 0 ; i <a.length ; i++) {
			a[i] = sca.nextInt();
		}
		System.out.println(a[0]);
		
		
		
		
		
			
				

	}

}
