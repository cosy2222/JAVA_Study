package chap06_07.EX06;

import java.util.Scanner;




public class Q3 {
	
	
	static void sport1 ( String ... values) {
		int a = 0 ;
		int c = 0 ;
		double k = 0 ;
		
		for(int i = 0 ; i < values.length ; i++) {
			if(values[i].equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
			if(i %2 ==0) {
				System.out.print(values[i] + " : ");
				c++ ;
			}
			if(i %2 == 1) {
				int j = Integer.parseInt(values[i]);
				System.out.print(j + " ");
				a += Integer.parseInt(values[i]);
			}
			
		}
		k = (double)a/(values.length-c);
		System.out.println();
		System.out.println("������� ������ �� �հ� : " + a);
		System.out.println("������� ������ ��� : " + k);
		
		
	}

	public static void main(String[] args) {
		
		System.out.println( "������ ��� �ش��� �������� �Է��ϼ���");
		Scanner sca = new Scanner (System.in);
		
		String sport = sca.nextLine();        // String ���� ��ǲ �޴� ���� 
		String array [] = sport.split(" ");         // ��ǲ���� ���� ������ �������� ������ �迭�� ���� 
		
		
		sport1(array);
		
		
		
			
				
		

	}

}
