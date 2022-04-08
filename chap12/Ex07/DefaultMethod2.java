package chap12.Ex07;

interface A{
	default void abc() {           // 인터페이스내의 구현부가 있는 메소드는 default
		System.out.println("A인터페이스의 abc()");
	}
}

class B  implements A {   // extends Object가 생략
	public void abc() {   // 오버라이딩
		A.super.abc();		// super.abc()는 object클래스의 abc()호출
		System.out.println("B클래스의 abc()");
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
