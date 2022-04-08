package chap18.Ex02;



// �Ʒ� 4���� �������̽��� ���ٽ����� ó���� ���� : �Լ��� �������̽�

@FunctionalInterface
interface A{			// �Է� x ���� x
	void method1();
}

@FunctionalInterface
interface B{		// �Է� o  ���� x
	void method2(int a);
}

@FunctionalInterface
interface C{		// �Է� x  ����o
	int method3();
}

@FunctionalInterface
interface D{		// �Է� 0  ����0
	double method4(int a , int b);
}


public class FunctionToLambedExprssion {

	public static void main(String[] args) {
		
		// 1. �Է� x , ���� X
		//1-1  
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("�޼ҵ� 1-1");
			}
		};
		a1.method1();
		
		// 1-2  ���ٽ����� ó��
		//		���ٽ��� ����Ÿ�� , �޼ҵ��̸����� ����
		
		A a2 = () -> {System.out.println("�޼ҵ�1-2");};
		A a3 = () -> System.out.println("�޼ҵ�1-3");	// �����ο� �Ѷ��θ� �����ҋ� {} ��������
		
		a2.method1();
		a3.method1();
		
		
		// 2. �Է� 0 ����X
		// 2-1 �͸��̳�Ŭ����
		
		B b1 = new B() {

			@Override
			public void method2(int a) {
				System.out.println("�޼ҵ�2-1" + a);
			}
		};
		
		b1.method2(0);
		
		// 2-2 ���ٽ�
		B b2 = (int a) -> {System.out.println("�޼ҵ�2-2" +a);};
		B b3 = (a) -> {System.out.println("�޼ҵ�2-3" +a);}; // �Է¸Ű������� Ÿ���� ��������
		B b4 = (a) -> System.out.println("�޼ҵ�2-4" +a); // ���๮�� �Ѷ����ϋ� {} ���� ����
		B b5 = a -> System.out.println("�޼ҵ�2-4" +a); // �Է¸Ű������� �ϳ��ϋ� () ��������
		b2.method2(1);
		b2.method2(2);
		b2.method2(3);
		b2.method2(4);
		
		
		
		// 3. �Է� x  ����0
		
		//3-1 �͸��̳�Ŭ����
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println(c1.method3());
		
		C c2 = () -> {return 5;};
		C c3 = () -> 6;			//������ �Ѷ������� ����� ��� : return�� �������� , �ݵ�� �߰�ȣ�� �Բ�����
		
		
		
		System.out.println(c2.method3());
		System.out.println(c3.method3());
		
		
		// 4 . �Է� 0 ���� 0 
		
		// 4-1 �͸��̳�Ŭ����
		
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a + b;
			}
		};
		System.out.println(d1.method4(1, 2));
		
		//4-2 ���ٽ�
		
		D d2 = (int a, int b) -> {return a+b;};
		D d3 = ( a,  b) -> {return a+b;};	// �Ű����� Ÿ�� ��������
		D d4 = ( a,  b) ->  a+b;			// return ��������
		
		System.out.println(d2.method4(3, 4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
