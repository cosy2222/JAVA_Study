package chap14.Ex01;

public class CheckedException_1_1 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println( 10 / 0);      // ���α׷��� ������ ���� �Ǿ� ������
											  // ���� ó�� 
			}catch(ArithmeticException e) {   
				//try ������� ������ �߻��� ��쿡 ����ȴ� 
				//e.printStackTrace();     // ���������� �ڼ��� ������ ���
				//System.out.println("0�� ������ �����ϴ�");
			}finally {
				//try{} ������ ��� �۵� , ������ �־ �۵�
				//try{} �� �۵��Ǹ� �׻� �۵� 
				//��ü�� ����� ��ü�� �޸𸮸� ���� �ҋ� , sc.close(); 
				System.out.println("finally{}�� �׻� ȣ���");
			}
				
			
		
		System.out.println("���α׷��� ���� �����մϴ�");		// ���� ���� 
		
	}
}
