package practice;

public class For {

	public static void main(String[] args) {
		int a ;
		int b = 0;
		int c = 0;
		
		for( a=1 ; a<=1000 ; a++) {
			if(a % 4 == 0) {
				b += a;
				c++;
				
			}
		}
		
		System.out.println("4�� ����� ���� : " + b );
		System.out.println("��� ���� : " + b /c);
		System.out.println(c);

	}

}
