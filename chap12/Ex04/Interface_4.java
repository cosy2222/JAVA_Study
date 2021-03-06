package chap12.Ex04;

// 인터페이스 상속시 자식클래스 접근 지정자 오류
		// 인터페이스의 메소드를 구현 할 떄 반드시 public 를 사용해야 한다
interface A{
	public abstract void abc();
}
class F implements A{      // F클래스는 완성된 메소드가 구현되어 있어야 한다 .

	@Override
	public void abc() {
	}
}

interface B {
	void abc();
}

class C implements A{
	public void abc() {	 // A인터페으스의 abc() 를 오버라이딩 해서 구현한 메소드
					     // 자식은 부모 보다 접근지정자가 같거나 더 넓어야 한다
	}
}

class D implements B {
	public void abc() {  //인터페이스의 메소드를 구현할떄는 반드시 public 접근 지정자를 사용해야 한다 
		
	}
}


public class Interface_4 {

	public static void main(String[] args) {

	}

}
