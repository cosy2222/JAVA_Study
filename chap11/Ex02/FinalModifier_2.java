package chap11.Ex02;

// final �޼ҵ� �� final class �� Ư¡
	//final �޼ҵ� : �������̵��� �Ұ� , ���� �߿��� �޼ҵ带 �ڽĿ��� ������ ���� ���ϵ��� ���� 
	//final Ŭ���� : ����� �Ұ����� Ŭ����

class A{
	void abc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
//	void bcd() {}  // �޼ҵ� �������̵� �Ұ���
}

final class C {
	
}

//class D extends C{}	//final Ŭ���� C�� ��� �Ұ�




public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
