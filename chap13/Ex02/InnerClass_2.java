package chap13.Ex02;

// �̳�Ŭ�������� �ܺ�Ŭ������ �ʵ�� �޼ҵ� ���� ���



class A{
	int a = 3;
	int b = 4;
	int c = 33; 
	int d = 44;
	void abc() {         // ���� : �������̵��� �ƴ� , �ܺ� ���� Ŭ������ ������ �޼ҵ�� ������ ������ ��ġ
		System.out.println("AŬ������ �޼ҵ� abc()");
	}
	
	class B{   // �̳�Ŭ�������� �ܺ� Ŭ������ �ߺ��� �ʵ峪 �޼ҵ� ȣ�� �� ��� : A.this.        
				// super�� ��� �Ұ��� 
		int a = 5;
		int b = 6;
		void abc() {     // �������̵��� �ƴ�, ������ �޼ҵ�
			System.out.println("BŬ������ �޼ҵ� abc()");
		}
		void bcd() {
			// 1. �ڽ��� �ʵ�� �޼ҵ� ȣ�� ( �̳�Ŭ���� )
			System.out.println(a);    // this.a
			System.out.println(b);
			abc();
			// 2 . �ܺ�Ŭ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(A.this.a);    // �ܺ�Ŭ������ �ʵ尪 ȣ��   !����: super�� ���ȵ� 
			System.out.println(A.this.b);
			A.this.abc();
			System.out.println(c);
			System.out.println(d);
			
		}
		
	}
}


public class InnerClass_2 {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.bcd();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
				
		
		

	}

}
