package chap06_07.EX06;

import java.util.Scanner;

public class Q3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��̸��� ���������� ������ �̿��ؼ� �Է� �ϼ���");
		System.out.println("��) �Է� >>> Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
		
		
		String str;                  
		String [] arr ;               
		int sum =0 ;
		int memberCount = 0;
		double avg = 0; 
		int b = 0 ;
		
		
		
		while(true) {
			str = sc.nextLine();
			arr = str.split(" ");
			if ( str.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break ;
			}
			
			for (int i = 0 ; i < arr.length ; i ++ ) {
				if ( i %2 == 0 ) {
					System.out.print(arr[i] + " : ");
				}
				if ( i%2 !=0) {
					b = Integer.parseInt(arr[i]);
					sum += b ;
					memberCount++ ;
					System.out.print(arr[i] + " ");
				}
			}
			avg = (double)sum/memberCount ;
			System.out.println();
			System.out.println("�������� �� : " + sum);
			System.out.println("�������� ��� : " + avg);
				
		}
		
			
		

	}

}
