package chap14.Ex01;

import java.util.Scanner;

// Error : ���α׷��Ӱ� ������ �� ���� �κ�, Os �߻��ϴ� Error , H/W Error

// Exception (����) : ���α׷��Ӱ� ���� �� �� �ִ� �κ� 
		// ���ܰ� �߻� �Ǹ� ���α׷��� ����Ǿ� ������.
		// ���ܰ� �߻� �Ǵ��� ������� �ʰ� ó�� (����ó��)

// ArithmeticException : ����� 0���� ������ �߻��ϴ� ����
	// ��ǻ�ʹ� ����� 0���� ������� ��� �Ұ�. 

public class CheckedException_1 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("������ �ϳ��� �Է��ϼ���");
		int a = sca.nextInt();
		
		int b = 10 ;
		
		try {    // try ������� ����(Exception)�� �߻��� ��� 
			System.out.println( b / a   );
			
		}catch (ArithmeticException e) {
			// catch ��� : try{} ������� ������ �߻��� ��� catch{}����� �۵�
			System.out.println("������ �߻��߽��ϴ� 0���� ������ �����ϴ�");
			
		}finally{
			
		}
		
		System.out.println("���α׷��� ���� �մϴ� ");

	}

}
