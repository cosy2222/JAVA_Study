package practice;

import java.util.Scanner;




public class Q3 {
	
	
	static void sport1 ( String ... values) {
		int a = 0 ;
		double k = 0 ;
		for(int i = 0 ; i < values.length ; i++) {
			if(i %2 ==1) {
				System.out.print(values[i] + " : ");
			}
			if(i %2 == 0) {
				int j = Integer.parseInt(values[i]);
				System.out.print(j + " ");
				a += Integer.parseInt(values[i]);
			}
		}
		System.out.println("������� ������ �� �հ� : " + a);
		
		
	}

	public static void main(String[] args) {
		
		System.out.println( "������ ��� �ش��� �������� �Է��ϼ���");
		Scanner sca = new Scanner (System.in);
		
		String sport = sca.nextLine();
		String array [] = sport.split(" ");
		
		sport1(array);
		
			
				
		

	}

}
