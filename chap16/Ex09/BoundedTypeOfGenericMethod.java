package chap16.Ex09;

// ���ʸ� �޼ҵ��� ���� ���� : 

class A{	// �Ϲ� Ŭ�������� ���ʸ� �޼ҵ�.
	
	//Number : Boolean , Character �� ������ 6���� Ÿ�� ( Byte , Short , Integer , Long , Float , Double )
	public <T extends Number>void method1 (T t){
		System.out.println(t.intValue());		// Number Ÿ���� �޼ҵ�   .intValue() : ������ ���
	}
}

interface MyInterface{
	void print();	// public abstract �� ������ 
}

class B{  // ���ʸ� Ÿ�� ���ο��� �������̽��� ���� �ҋ��� extends Ű�� ����Ѵ� 
	public <T extends MyInterface> void method2(T t) {	// T�� Ÿ�Կ� �ü� �ִ� ���� MyInterface�� ������ Ŭ������ �ü� �ִ� 
		t.print();
	}
}

class C implements MyInterface{

	@Override
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� ");
	}
}


class D{
	public <T> void abc(T t){
		System.out.println(t);
	}
}

public class BoundedTypeOfGenericMethod {
	
	public static void main(String[] args) {
		
		A a = new A(); 
		a.<Double>method1(5.8);
		a.method1(22.5);		// �Ű������� ������ ���� Ÿ���� �ĺ� �� �� �ִ� ��� ���� ����
		a.<Long>method1(1000000L);
		a.<Float>method1(100.5555F);
//		a.<Boolean>method1(true);    // Character , Boolean �� ���� �߻� 
		
		
		System.out.println("========================");
		
		B b = new B();
		
		//Method2�� �Ű������� �ü� �ִ� ����  �������̽�Ÿ��
		// �������̽��� ������ �ڽ� Ŭ����
		// �������̽��� ������ ���� �͸� Ŭ����
		b.<MyInterface>method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("print() ����");
			}
		});	
		
		b.<MyInterface> method2(new C());   // �Ű������� �������̽��� ������ �ڽ� ��ü
		
		// �͸� Ŭ������ ���ʸ� �޼ҵ� ȣ���� �Ű������� �����ֱ�
		b.method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("�͸����� ó���� Ŭ���� ���");
			}
		});
		
		
		D d = new D();
		d.<String> abc("�ȳ�");
		d.abc("�ϼ���");
		

	}

}
