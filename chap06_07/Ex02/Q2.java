package chap06_07.Ex02;

import java.util.Scanner;

public class Q2 {
	
		static void math ( String ... values) {
			int sum = 0 ;        // ������ ������ ���ϴ� ����
		    double  avg ;        // ����� �����ϴ� ����
		    
		    for (int i = 0 ; i < values.length ; i++) {
		    	 // sum = sum + values[i] ;       //
		    	 //	sum = sum + Integer.parseInt(values[i]);     //Integer.parseInt (String)  : ������ String Ÿ���� ������ ��ȯ
		    	sum += Integer.parseInt(values[i]);
		    }
		    avg = (double)sum/values.length;
			System.out.println("�� : " + sum);
			System.out.println("��� : " + avg);
		}
	
	
	

	public static void main(String[] args) {
		// ��ĳ�ʷ� ������ �������� �Ҵ� �޾Ƽ� �հ�� ����� ���
		
		Scanner sca = new Scanner (System.in);
		System.out.println("�������� �Է��ϼ���");
		
		
		String num = sca.nextLine();  // ������ ���Ƿ� ��ü �������� ��Ʈ������ �޾ƾ���
		String [] array1 = num.split(" ");     // split : �����ڷ� �������� ���ڸ� �߶� �迭�� ���� 
		
		
		for (int i = 0 ; i < array1.length ; i ++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		math(array1);   // ���� ���� �޼ҵ� math �� ȣ���ϸ鼭 �Ű������� array1��  �־��� 
		
		

	}

}
