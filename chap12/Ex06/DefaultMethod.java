package chap12.Ex06;

// interface �� default �޼ҵ� : �������̽� ������ �����ΰ� �ִ� �޼ҵ带 �����ҋ� ��� 
	// ������ �����Ǿ��ִ� �������̽��� ���ο����� �߰��ҋ� ����Ŭ�������� ������ �ʿ���� ���ο����� �߰��ҋ� ���
	// public default void bcd() {}
		// Java 1.8 �̻󿡼� ���Ӱ� �߰��ȱ��

	//default Ű�� �־�� �Ѵ� , default �� ���������ڰ� �ƴϴ� 

interface A{
	void abc();       // 2005�� ���� �޼ҵ�   , public abstract �� ������ , �����ΰ� ���� �߻� �޼ҵ�
	default void bcd () {	// 2020 ���� �޼ҵ� 
		System.out.println("A�������̽��� bcd()");
	}
	//void ttt();   // �������̽����� ���ο� �߻�޼ҵ带 �߰��ϸ� ��ӵ� ��� ����Ŭ�������� �����߻�
}

class B implements A{    // 2005�� ���� �޼ҵ� 
	public void abc() {
		System.out.println("BŬ������ abc");
	}
}

class C implements A{
	public void abc() {
		System.out.println("CŬ������ abc()");
	}
	public void bcd() {		//default �޼ҵ嵵 �������̵� �� �� �ֵ� 
		System.out.println("CŬ������ bcd()");
	}
}


public class DefaultMethod {

	public static void main(String[] args) {
		
		// ��ü����
		A b = new B();
		A c = new C();
		
		// �޼ҵ� ȣ��
		b.abc();
		b.bcd();
		System.out.println("===============================");
		c.abc();
		c.bcd();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
