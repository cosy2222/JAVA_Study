package chap10.Ex06.Ex01;

// �ڽ� ��ü�� �����ҋ� �θ�Ŭ������ �⺻ �����ڸ� ���� ȣ�� �Ѵ� : super() �� �����Ǿ�����
// ��� �ڽ� ��ü�� �����ڿ��� super() �� �����Ǿ����� 

class A{
	A(){
		System.out.println("A class �� �⺻ ������");
	}
	
	A(int a){
		System.out.println("A class�� �Ű����� ���� 1�� ������" + a);
	}
	
	A(int a , int b){
		System.out.println("A class�� �Ű����� ���� 2�� ������ " + a + " , " + b);
	}
}

class B extends A{
	B(){
		System.out.println("BŬ������ �⺻ ������");
	}
	B(String a){
		super(3,5);
		System.out.println("BŬ������ �Ű����� ���� 1�� ������ " + a);
	}
}

class C extends B{
	C(){
		super("C���� ȣ��");
		System.out.println("CŬ������ �⺻ ������");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println("===================");
		
		
		
		

	}

}
