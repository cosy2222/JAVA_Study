package Ex;

import java.util.Scanner;

public class Ex_12_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str = {"����" , "����" , "��"};
		String uSelect, comSelect ;    // uSelect : ����� �� ��(��ĳ�ʷ� ��ǲ)  ,  comSelect: ��ǻ�Ͱ� ����(�����߻���)
		
		int n;
		
		System.out.println(" ��ǻ�Ϳ� \' ���� ���� �� \' ������ �մϴ�");
		
		do {
			System.out.print("���� ���� �� !! >>> ");
			uSelect = sc.next();
			if( uSelect.equals("�׸�")) {
				break;
			}
			n = (int)(Math.random()*3);   // ��ǻ�Ͱ� ���� �� : 0,1,2
			comSelect = str[n];           // ��ǻ�Ͱ� ���°� :  0:����   1:����   2: �� 

			if ( uSelect.equals("����")) {    // ����ڰ� ���� �϶�
				if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �����ϴ�.");
				}
				else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �����ϴ�.");
				}
				else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �̰���ϴ�.");
				}
			}
			
			else if(uSelect.equals("����")) {   // ����ڰ� ���� �϶�
				if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �����ϴ�.");
				}
				else if(comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �����ϴ�.");
				}
				else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �̰���ϴ�.");
				}
			}
			
			else if(uSelect.equals("��")) {     // ����ڰ� �� �϶�
				if(comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �����ϴ�.");
				}
				else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �����ϴ�.");
				}
				else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = "+comSelect + " �̰���ϴ�.");
				}
			}
			
			
		}
		while(true) ;
		
		
		
		sc.close();
		System.out.println("���α׷��� ���� �մϴ�");
		
	}

}
