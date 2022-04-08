package chap13.Ex09;

// 매개변수로 받아서 처리 : 인터페이스를 구현한 클래스가 없다

interface A{
	void abc();      // public abstract
}

class C {
	void cde(A a) {
		a.abc();
	}
}



public class AnnoymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		
		// 1. 인터페이스를 구현한 클래스 x  + 참조변수 생성 o
		A a = new A() {    // 인터페이스를 구현한 자식 익명객체 생성후 타입을 A로 지정한 참조변수 생성
			@Override
			public void abc() {
				System.out.println("클래스 x  + 참조변수 o");
			};
		};
		c.cde(a);     // 참조변수를 매개변수로 할당
		
		// 2. 인터페이스를 구현한 클래스 x  + 참조변수 생성 x   <=== 제일많이사용    , 한번만 사용
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("클래스 x  + 참조변수 x");
			}
		});
		
		
		
	}

}
