package chap4;

public class DoWhile_Ex04 {

	public static void main(String[] args) {
		
		//2. While ���� Do-While���� �� : ������ 0 �� ���
		System.out.println("==========�ݺ�Ƚ���� 0 �� ���===============");
		int a = 0;
		while(a < 0){
			System.out.print(a + " ");
			a++;
		}            //While ���� ������ true �ϋ��� �۵�
		System.out.println("==============================");
		
		a = 0;
		do {
			System.out.print(a + " ");            // Do-While ������ true, false ������� ������ �ѹ��� ���� 
			a++;
			
		} while( a < 0);      // ������ false
		
		System.out.println();

		System.out.println("===========�ݺ� Ƚ���� 1�� ���=============");
		// �ݺ�Ƚ���� 1 �� ���
		
		a = 0;
		while( a < 1) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 1);
		
		System.out.println();
		System.out.println("==============�ݺ� Ƚ���� 10 �� ���");
		// �ݺ�Ƚ���� 10 �� ���
		a = 0;
		while(a < 10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while ( a < 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
