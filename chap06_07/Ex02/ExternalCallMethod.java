package chap06_07.Ex02;



// �پ��� Ÿ���� �޼ҵ� ����   ����Ÿ���� �ִ°�� (int , double , String ...)
//						 ����Ÿ���� ���� ���� void ���
public class ExternalCallMethod {

	public static void main(String[] args) {
		//��ü����
		A a = new A() ;        // ���� ��Ű�� ���� Ŭ������ import���� ȣ���ؼ� ��밡�� 
		
		// �޼ҵ� ȣ��
		a.print();
		int k = a.data();
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethod(5);  
		a.printMethod(25);
		
		// ! ���� :
		
		System.out.println(a.data());    // ��±����� ȣ�� ������ �޼ҵ�  ( �������ִ� �޼ҵ� )
	  //System.out.println(a.print());   // ��±����� ȣ�� �Ұ����� �޼ҵ� ( ������ ���� �޼ҵ�) �����߻�
		a.print();
		System.out.println(a.sum(4, 10.5));
	  //System.out.println(a.printMethod(3));   //�����߻�
		
		a.printMethod(3);
		
		
		
		
		
		
		
		
		
	}

}

