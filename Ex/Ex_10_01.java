package Ex;

public class Ex_10_01 {

	public static void main(String[] args) {
		int a, b;
		
		for (int i = 1 ; i < 100 ; i++) {
			a = i/10;         // �����ڸ�
			b = i%10;         // �����ڸ�
			if( (a == 3 || a==6 || a==9) && (b == 3 || b == 6 || b ==9)) {
				System.out.println( i + " �ڼ� ¦¦");
			}
			else if(b==3 || b == 6 || b ==9) {
				System.out.println(i + "�ڼ� ¦");
			}
			else if((a==3 || a == 6 || a==9) && (b !=3 || b!=6 || b!=9)) {
				System.out.println(i + "�ڼ� ¦");
			}
				
			
		}

	}

}
