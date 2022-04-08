package chap12.Ex06;

// interface 의 default 메소드 : 인터페이스 내에서 구현부가 있는 메소드를 정의할떄 사용 
	// 기존의 구현되어있는 인터페이스에 새로운기능을 추가할떄 하위클래스에서 재정의 필요없이 새로운기능을 추가할떄 사용
	// public default void bcd() {}
		// Java 1.8 이상에서 새롭게 추가된기능

	//default 키를 넣어야 한다 , default 는 접근지정자가 아니다 

interface A{
	void abc();       // 2005년 생성 메소드   , public abstract 가 생략됨 , 구현부가 없는 추상 메소드
	default void bcd () {	// 2020 생성 메소드 
		System.out.println("A인터페이스의 bcd()");
	}
	//void ttt();   // 인터페이스에서 새로운 추상메소드를 추가하면 상속된 모든 하위클래스에서 오류발생
}

class B implements A{    // 2005년 생성 메소드 
	public void abc() {
		System.out.println("B클래스의 abc");
	}
}

class C implements A{
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	public void bcd() {		//default 메소드도 오버라이딩 할 수 있디 
		System.out.println("C클래스의 bcd()");
	}
}


public class DefaultMethod {

	public static void main(String[] args) {
		
		// 객체생성
		A b = new B();
		A c = new C();
		
		// 메소드 호출
		b.abc();
		b.bcd();
		System.out.println("===============================");
		c.abc();
		c.bcd();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
