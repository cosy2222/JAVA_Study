package chap06_07.EX06;

// ���� �ʱ�ȭ ��� : �����ڿ� ���� static �ʵ��� ���� ȣ��� �ʱ�ȭ �ϴ� ��Ȱ

//  �����ڿ� static ��� : 
//      -������ : �ν��Ͻ� �ʵ带 �ʱ�ȭ ,  static �ʵ��� ���� �ʱ�ȭ
//      -static ��� : static �ʵ��� ���� �ʱ�ȭ   �ν��Ͻ� �ʵ��� ���� �ʱ�ȭ �Ұ���

class E{
	
	int a ; 
	static int b = 3 ;
	
	static {       // ����(static) �ʱ�ȭ ��� : ��ü ���� ���� Ŭ���� ������ ȣ���ҋ� �ʱ�ȭ  
//		a = 3;     �����߻� :  static������ �ν��Ͻ� �ʵ�� �ʱ�ȭ �Ҽ� ���� 
		b = 5;
		System.out.println("class E �� �ε��Ǿ����ϴ�.  ���� b : " + b  );
	}
	
	E(){            // ������ : ��üȭ�� �ҋ� �ʵ尪�� �ʱ�ȭ
		a = 3 ;		// �ν��Ͻ��ʵ� �ʱ�ȭ
		b = 10;		// �����ʵ� �ʱ�ȭ
	}
	
	
}

public class Static_3 {

	public static void main(String[] args) {
		
		System.out.println(E.b);     // ��ü ���� ���� E.b ȣ�� �ɋ� Static ����� �۵��� : Static�� ���� �ʱ�ȭ �� 
		
			
		
		
		
		
		
	}

}
