package chap14.Ex03;

public class MutiCatch_2 {

	public static void main(String[] args) {
		
		
		// 1. Exception���� ��� ���ܸ� ó�� �� �� �ִ�.
			// ��� ���ܴ� Exception�� ��� �޴´� 
		
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(Exception a) {
			
			// try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("���� ó��(Exception)");
			
		}
		
		//2. catch ����� ������ �߸��� ��� : Exception�� catch�� �������� �;��Ѵ� 
		
		/*
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(Exception a) {
			// try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("���� ó��");
		}catch(ArithmeticException a) {
			
		}catch(NumberFormatException a) {
			
		}
		*/
		
		// 3. catch ����� �ùٸ� ���� : �ֻ��� Exception�� catch����� �������� ��ġ
		
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(ArithmeticException a) {
			
		}catch(NumberFormatException a) {
			
		}catch(Exception a) {   // Excepion �� �������� ��ġ
		}
		
		//4. �������� Exception�� �����ؼ� ����.
		
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException  a) {
			// �������� Exception�� ����
		}catch(Exception a ) {
			
		}
		
		System.out.println("���α׷� ����");
		
		
		
		
		
		
		
		
		

	}

}
