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
		
		//for ������ ���
		for( int i = 0 ; i < arr2.length ; i++) {
			System.out.println(i + "�������� �� : " + arr2[i]);
		}
		
		
		// ���� for �� ���� ���
		System.out.println("============���� for�� ==================");
		
		for ( int i : arr2) {
			System.out.println(i);
		}
		
		// Arrays.toString ���� ���
		System.out.println("====================Arrays.toString==========================");
		System.out.println(Arrays.toString(arr2));
		
		
		
		// Ȧ�������� ���� ��� 
		System.out.println("=========Ȧ�������� ���� ���=================");
		for(int i = 100 ; i < arr2.length ; i++) {
			if( i %2  == 0) {
				continue;
			}
			
			System.out.println(i + "�������� �� : " + arr2[i]);
		}
			

	}

}
