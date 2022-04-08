package chap18.Ex04;

// ���ٽ��� Ȱ��
//		1. �͸��̳�Ŭ������ Ȱ���ϴ� ���
// 		2. �޼ҵ� ���� (1. �ν��Ͻ� �޼ҵ� ���� , 2.���� �޼ҵ� ����)
//			�޼ҵ� ���� : �������� �ִ� �޼ҵ带 ���� 
//						�޼ҵ� ������ ���ؼ��� ����Ÿ�԰� �Ű������� �����ؾ� �Ѵ�


interface A{
	void abc();
}

class B{
	void bcd() {			// �ν��Ͻ� �޼ҵ� : ��üȭ�ؾ� ȣ���� ����
		System.out.println("bcd");
	}
	
}

public class RefOfInstanceMethod_Type_1 {

	public static void main(String[] args) {
		
		//1. �ν��Ͻ� �޼ҵ� ���� type1 <== �͸� �̳� Ŭ����  
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		// 2. ���� �ó������� ���ٽ����� ǥ��
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		
		// 3. �ν��Ͻ� ���� ǥ���� Type1
		B b = new B();	// �ν��Ͻ���ü ����  ,   ��ü�� :: �޼ҵ�� 
		A a3 = b::bcd;  // <== �ν��Ͻ� ����ǥ�� <<== ����Ÿ���� ���ƾ� �Ѵ� 
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
		
		

	}
}
