package chap12.Ex07;

interface A{
	default void abc() {           // �������̽����� �����ΰ� �ִ� �޼ҵ�� default
		System.out.println("A�������̽��� abc()");
	}
}

class B  implements A {   // extends Object�� ����
	public void abc() {   // �������̵�
		A.super.abc();		// super.abc()�� objectŬ������ abc()ȣ��
		System.out.println("BŬ������ abc()");
	}
}




public class DefaultMethod2 {

	public static void main(String[] args) {
		
		
		B b =new B();
		
		b.abc();
		System.out.println("=================");
		
		A a = new B();
		a.abc();

	}

}
