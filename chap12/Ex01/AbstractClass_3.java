package chap12.Ex01;


abstract class D {
	
	abstract void print() ;
	
}

class E extends D {
	void print() {
		System.out.println("EŬ������ print()");
	}
}



public class AbstractClass_3 {

	public static void main(String[] args) {
		// 1. ��üȭ �ؼ� ���
		D e1 = new E();
		D e2 = new E();
		D e3 = new E();
		
		e1.print();
		e2.print();
		e3.print();
		
		System.out.println("===================");
		//2. �͸� Ŭ������ ���� �ؼ� ���
		D d1 = new D() {
			void print() {
				System.out.println("�͸�Ŭ����1");
			}
		};
		
		D d2 = new D() {
			void print() {
				System.out.println("�͸�Ŭ����2");
			}
		};
		
		D d3 = new D() {
			void print() {
				System.out.println("�͸�Ŭ����3");
			}
		};
		
		d1.print();
		d2.print();
		d3.print();
		

	}

}
