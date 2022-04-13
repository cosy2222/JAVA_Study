package chap19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		//1. �ܼ� �Է� (MS949) : default charset , byte ��Ʈ��
		
		try(InputStreamReader isr = new InputStreamReader(System.in , "MS949")){
			
			// isr�� ��ȯ�� char
			
			System.out.println("�ѱ��� �Է��ϼ���");
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
			
		}catch(Exception e) {}
		
		
		// �ܼ� �Է� (UTF 8 )
		
			try(InputStreamReader isr = new InputStreamReader(System.in , "UTF-8")){
			
			// isr�� ��ȯ�� char
			
			System.out.println("�ѱ��� �Է��ϼ���");
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
			
		}catch(Exception e) {}
		

	}

}
