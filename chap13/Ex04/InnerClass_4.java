package chap13.Ex04;

// ���� �̳�Ŭ���� : Ŭ������ �޼ҵ� ���ο� ����� Ŭ����
// �޼ҵ� ������ �ʵ�� finalŰ�� �����Ǿ�����
// �����̳�Ŭ�������� ���Ǵ� ���������� �ڵ����� final Ű�� ��

class A {
	int a = 3;
	void abc() {
		int b = 5;    // ���� ���� : �޼ҵ� ���ο� ����� ����
					  // �ڵ����� final Ű�� �����Ϸ��� ���ؼ� �ڵ����� �Ҵ�
		class B {		//���� �̳�Ŭ����
			void bcd() {
				System.out.println(a);   // �ʵ�
				System.out.println(b);	 // ��������
				a=5;
		//		b=7;      final Ű�� �־ ���� �Ұ���  
			}
		}
		
		B bb = new B();
		bb.bcd();
					   
	}
}



public class InnerClass_4 {

	public static void main(String[] args) {
		// 1. ��ü������ �޼ҵ� ȣ��
		A a = new A();
		a.abc();
		

	}

}
