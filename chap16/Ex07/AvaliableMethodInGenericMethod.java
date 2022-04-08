package chap16.Ex07;

// 제너릭 메소드 내부에서 사용 가능한 메소드 : Object 클래스의 메소드만 사용 가능 하다 

class A{
	public <T> void method(T t) {
//		System.out.println(t.length());  // t.length() : String 클래스에서 글자수를 리턴해줌   , 사용불가
		System.out.println(t.equals("안녕"));   // t.equals()는 Object 클래스의 메소드
											   // Object클래스의 메소드는 사용가능
	}
}


public class AvaliableMethodInGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("안녕");

	}

}
