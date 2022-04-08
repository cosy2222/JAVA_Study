package chap12.Ex01;


abstract class D {
	
	abstract void print() ;
	
}

class E extends D {
	void print() {
		System.out.println("E클래스의 print()");
	}
}



public class AbstractClass_3 {

	public static void main(String[] args) {
		// 1. 객체화 해서 출력
		D e1 = new E();
		D e2 = new E();
		D e3 = new E();
		
		e1.print();
		e2.print();
		e3.print();
		
		System.out.println("===================");
		//2. 익명 클래스를 생성 해서 출력
		D d1 = new D() {
			void print() {
				System.out.println("익명클래스1");
			}
		};
		
		D d2 = new D() {
			void print() {
				System.out.println("익명클래스2");
			}
		};
		
		D d3 = new D() {
			void print() {
				System.out.println("익명클래스3");
			}
		};
		
		d1.print();
		d2.print();
		d3.print();
		

	}

}
