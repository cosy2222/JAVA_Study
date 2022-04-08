package chap12.Ex05;


//방법 1 : 클래스를 생성후 구현
// 방법2 : 익명 클래스를 이용하는 방법


// 인터페이스 선언 
interface A {
	double PI = 3.14;       // public static field
	void run();				// public abstract
}

class B implements A {

	@Override
	public void run() {    
		System.out.println("ㅎㅇ");
	}
	
}



public class Interface_5 {

	public static void main(String[] args) {
		//1. 객체 생성후 출력
		A a1 = new B();
		a1.run();
		
		
		//2. 익명 객체로 출력
		A a2 = new A() {
			public void run() {
				System.out.println("ㅎㅇㅇ");
			}
		};
		a2.run();

	}

}
