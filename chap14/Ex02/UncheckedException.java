package chap14.Ex02;

// ���� ���� ( Unchecked Exception , Runtime Exception ) : �����ϴܰ迡���� ���ܰ� �߻���������
	// ����ÿ� ���ܰ� �߻��� �� �ִ�  

class AA{}

class BB extends AA{}

public class UncheckedException {

	public static void main(String[] args) {
		
		//���࿹�� 
		// ArithmeticException : ����� 0���� ������ ���� �߻� 
	//	System.out.println( 10/0 );
		
		//ClassCastException : Ŭ������ Ÿ���� ��ȯ�ҋ�
		AA aa = new AA();
	//	BB bb = (BB) aa;    // ������ �ܰ迡���� ������ �߻����� �ʴ´�.
		
		
		// ArrayIndexOutOfBoundsException : �迭���� �������� �ʴ� ���ȣ�� ����� ��� �߻�
		int [] array = {1,2,3};
	//  System.out.println(array[3]);
		
		// NumberFormatException : ������ ���ڸ� ����Ÿ������ ��ȯ�Ҽ� ���� ���ܰ� �߻���
	//	int num = Integer.parseInt("10!");      // ���ڿ� 10�� ������ ��ȯ
	//	System.out.println(num);

		
		// NullPointerException  : ��ü�� null�Τ��� �޼ҵ带 ȣ���ϴ� ��� �߻�
		String str = null;
		System.out.println(str.charAt(4));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
