package chap13.Ex06;

class A{
	C c = new B ();      // CŸ�� �ν��Ͻ� ���� c
	void abc() {
		c.bcd();
	}
}

class B implements C{

	@Override
	public void bcd() {
		System.out.println("�ν��Ͻ� �̳� Ŭ����");
	}
	
}

interface C{
	void bcd();
}

public class AnnoymousClass_1 {

	public static void main(String[] args) {
		//��ü ���� �� �޼ҵ� ȣ��
		A a =new A();
		a.abc();      // �ν��Ͻ� �̳� Ŭ����

	}

}
