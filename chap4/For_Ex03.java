package chap4;

public class For_Ex03 {

	public static void main(String[] args) {

	System.out.println("-----�Ϲ��Ѱ輱-----");
	System.out.println("");
		
		//for �⺻ �۵�
		
		int a; // ���� ����, ��� �ۿ��� ����� ����, ���� (0), �ʱⰪ (x)
		for ( a = 0; a <= 3; a++) { // �̶� a++�� ++a�� ������� ���� 2���� ����ϴ� ������ ������, ���� ���������� ���� ���̰� ����.
			System.out.print(a + " "); // �� �� ����Ʈ�� ������ ���� ������ ������ ������ ��� ������ �� �Ŀ� ��°��� ��������, 
									   //�� ������ �����ͼ� �̱� ������ ����ϰ� �ѹ��� �������� ����. �̰� ��� ���� ��Ǯ���� �� �ܿ��� ��.
		}
		
		System.out.println(a);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		for (int b = 0; b <= 10 ; b++ ) { 
			System.out.print(b + " ");
		}
		
//		System.out.println(b); // ���� b �� for�� �������� ����� ���������̱� ������ for �� �ۿ��� ������ �ȵ�.
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		int c;
		for ( c= 10; c > 0 ; c--) {
		System.out.println((11-c) + "��° ���� :"+ c + " ");
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2�� ����� ����ϴ� for�� 
		
		int i;
		
		for (i = 0 ; i < 100; i += 2 )
			System.out.println((( i+2)/2) + "��° ����: " + i);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//  for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� ����.
		
		int j;
			
		for ( i = 0, j = 0; i < 9; i++ , j++) {
			System.out.println((i+1) +  "��° i * j ���� : " + (i * j)); 
			
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// for���� ����ؼ� 1���� 100���� ���� ���� ���
		
		int sum = 0;
		for (  i = 1;  i <= 100; i++)  {
			sum += i ;
		}
		System.out.println("1���� 10���� ���� �� :" + sum);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//for���� ����ؼ� 1���� 100���� ���� ���� ���
		
		int multi = 1;
		for( i = 1; i<= 10; i++ ) {
			
			multi *= i;
		}
		System.out.println(multi);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// ���� for�� : 1�� ~ 9�ܱ��� ������ ���
		
		for ( i = 1; i <=9; i++) { // i�� ���� ����ϴ� ����
			
			System.out.println("-----");
			System.out.println(i + "�� ����");
			System.out.println("-----");
			
			int d;
			int k;
			for (d = 1; d <= 9; d++) {
				k = i*d;
				System.out.println(i + " * " + d + " = "+ k);
			}
		}
		
		/* for���� ���� ���� �߻�
		
		for (i = 0; ; i++) {
			System.out.println(i + " ");
		}
		
		�̷��� ¥�θ� ����ؼ� ���ư��Ƿ� �ϴ� ��ǻ�Ͱ� �����̰� ���� ������. ���� ������ �����Ƿ� ���ڵ带
		����� ���� ��� �� �ڵ忡 unreachable code ������ ��.
		
		for (;;) {
			System.out.println("�ٹ��ѷ�����");
			System.out.println("�ڹ��ѷ�����");
		}
		
		�̷��� �ʱ�� ���ǽ� �������� ���� ������ ���ѷ����� ��°��� �����ư��鼭 ������. ��¦ ��¦ �̻ڴ���
		
		*/
		
		// ���� ������ ���� �극��ũ �д� ��ġ
		
		for (i = 0; ; i++) {
			System.out.println(i + " ");
			if (i > 2) {
				break;
			}
		}
		
		System.out.println("");
		System.out.println("-----�����Ѱ輱-----");		

		int multi4 = 0;
		for (i=1; i <= 4 ; i++) {
			multi4 += 4*i;
		}
		System.out.println(multi4);
		
		
		
	}

}
