package chap13.Ex010;
// �̳��������̽� (InnerInterface) : Ŭ���� ������ �������̽��� ����
	// static�� �ڵ����� �����Ϸ��� ���ؼ� ����   <== !����

class A{
	interface B{
		void bcd();         // public abstract
	}
}

// �̳� �������̽��� ������ Ŭ���� C
class C implements A.B{     // A.B : AŬ������ �̳��������̽�B,      A,B : �������̽� A , �������̽� B

	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ���� C");
	}      
	
}


public class InnerInterface_1 {

	public static void main(String[] args) {
		// 1. �ڽ� ��ü�� ���� ������ ��� ( �ڽ� Ŭ������ �����ϴ� ��� ) 
		A.B ab = new C();
		ab.bcd();
		C c = new C();
		c.bcd();
		
		
		// 2. �͸��̳� Ŭ������ ��� (�ڽ� Ŭ���� ���� ���)
		A.B a = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("�͸��̳�Ŭ������ ���");
			}
		};
		a.bcd();
	
	
	
	}

}
