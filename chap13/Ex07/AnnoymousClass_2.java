package chap13.Ex07;


// �͸� �̳� Ŭ������ ����Ͽ� �������̽� ��ü ����

class A{
	C c = new C () {
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");
		}
	};      // CŸ�� �ν��Ͻ� ���� c
	void abc() {
		c.bcd();
	}
	
}

interface C{
	void bcd();
}


public class AnnoymousClass_2 {

	public static void main(String[] args) {
		//��ü ���� �� �޼ҵ� ȣ��
				A a =new A();
				a.abc();      // �ν��Ͻ� �̳� Ŭ����

	}

}
