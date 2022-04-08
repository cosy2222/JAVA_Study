package chap11.Ex02;

// final 메소드 와 final class 의 특징
	//final 메소드 : 오버라이딩이 불가 , 아주 중요한 메소드를 자식에서 재정의 하지 못하도록 설정 
	//final 클래스 : 상속이 불가능한 클래스

class A{
	void abc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
//	void bcd() {}  // 메소드 오버라이딩 불가능
}

final class C {
	
}

//class D extends C{}	//final 클래스 C는 상속 불가




public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
