package Ex;

public class Ex_09_01 {

	public static void main(String[] args) {
		
		   
		   
		   double c = (double) Math.random();    // ���� �߻��� (������ ���� �ڵ����� �߻���Ŵ)
		               // 0.00000000xxx ~ 0.9999999999xxx
		   System.out.println(c);
		   
		   int d = (int) (Math.random()*10) ;  // 0~9 ������ ������ ���� ����
		   int e = (int) (Math.random()*10 + 1);   // 1���� 10 ������ ������ ���� ����
		   
		   System.out.println("0���� 9 ������ ������ �� : " + d);
		   System.out.println("1���� 10 ������ ������ �� : " + e);
		   
		   // 1���� 100������ ������ �߻���Ŵ
		   int f = (int)(Math.random() *100 +1 ) ;
		   System.out.println(f);          // 1���� 100����
		 

	}

}
