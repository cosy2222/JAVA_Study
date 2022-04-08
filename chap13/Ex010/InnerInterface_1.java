package chap13.Ex010;
// 이너인터페이스 (InnerInterface) : 클래스 내부의 인터페이스가 선언
	// static이 자동으로 컴파일러에 의해서 생성   <== !주의

class A{
	interface B{
		void bcd();         // public abstract
	}
}

// 이너 인터페이스를 구현한 클래스 C
class C implements A.B{     // A.B : A클래스의 이너인터페이스B,      A,B : 인터페이스 A , 인터페이스 B

	@Override
	public void bcd() {
		System.out.println("이너인터페이스를 구현한 클래스 C");
	}      
	
}


public class InnerInterface_1 {

	public static void main(String[] args) {
		// 1. 자식 객체를 직접 생성후 출력 ( 자식 클래스가 존재하는 경우 ) 
		A.B ab = new C();
		ab.bcd();
		C c = new C();
		c.bcd();
		
		
		// 2. 익명이너 클래스로 출력 (자식 클래스 없이 출력)
		A.B a = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("익명이너클래스로 출력");
			}
		};
		a.bcd();
	
	
	
	}

}
