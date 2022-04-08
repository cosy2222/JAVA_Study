package chap13.Ex09;

// �Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ������ ����

interface A{
	void abc();      // public abstract
}

class C {
	void cde(A a) {
		a.abc();
	}
}



public class AnnoymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// 1. �������̽��� ������ Ŭ���� x  + �������� ���� o
		A a = new A() {    // �������̽��� ������ �ڽ� �͸�ü ������ Ÿ���� A�� ������ �������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ���� x  + �������� o");
			};
		};
		c.cde(a);     // ���������� �Ű������� �Ҵ�
		
		// 2. �������̽��� ������ Ŭ���� x  + �������� ���� x   <=== ���ϸ��̻��    , �ѹ��� ���
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ���� x  + �������� x");
			}
		});
		
		
		
	}

}
