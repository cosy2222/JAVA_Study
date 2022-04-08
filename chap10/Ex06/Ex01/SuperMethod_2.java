package chap10.Ex06.Ex01;

// 자식 객체를 생성할떄 부모클래스의 기본 생성자를 먼저 호출 한다 : super() 가 생략되어있음
// 모든 자식 객체의 생성자에는 super() 가 생략되어있음 

class A{
	A(){
		System.out.println("A class 의 기본 생성자");
	}
	
	A(int a){
		System.out.println("A class의 매개변수 정수 1개 생성자" + a);
	}
	
	A(int a , int b){
		System.out.println("A class의 매개변수 정수 2개 생성자 " + a + " , " + b);
	}
}

class B extends A{
	B(){
		System.out.println("B클래스의 기본 생성자");
	}
	B(String a){
		super(3,5);
		System.out.println("B클래스의 매개변수 문자 1개 생성자 " + a);
	}
}

class C extends B{
	C(){
		super("C에서 호출");
		System.out.println("C클래스의 기본 생성자");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println("===================");
		
		
		
		

	}

}
