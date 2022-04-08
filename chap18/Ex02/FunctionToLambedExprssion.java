package chap18.Ex02;



// 아래 4개의 인터페이스는 람다식으로 처리가 가능 : 함수형 인터페이스

@FunctionalInterface
interface A{			// 입력 x 리턴 x
	void method1();
}

@FunctionalInterface
interface B{		// 입력 o  리턴 x
	void method2(int a);
}

@FunctionalInterface
interface C{		// 입력 x  리턴o
	int method3();
}

@FunctionalInterface
interface D{		// 입력 0  리턴0
	double method4(int a , int b);
}


public class FunctionToLambedExprssion {

	public static void main(String[] args) {
		
		// 1. 입력 x , 리턴 X
		//1-1  
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("메소드 1-1");
			}
		};
		a1.method1();
		
		// 1-2  람다식으로 처리
		//		람다식은 리턴타입 , 메소드이름까지 제거
		
		A a2 = () -> {System.out.println("메소드1-2");};
		A a3 = () -> System.out.println("메소드1-3");	// 구현부에 한라인만 존재할떄 {} 생략가능
		
		a2.method1();
		a3.method1();
		
		
		// 2. 입력 0 리턴X
		// 2-1 익명이너클래스
		
		B b1 = new B() {

			@Override
			public void method2(int a) {
				System.out.println("메소드2-1" + a);
			}
		};
		
		b1.method2(0);
		
		// 2-2 람다식
		B b2 = (int a) -> {System.out.println("메소드2-2" +a);};
		B b3 = (a) -> {System.out.println("메소드2-3" +a);}; // 입력매개변수의 타입은 생략가능
		B b4 = (a) -> System.out.println("메소드2-4" +a); // 실행문이 한라인일떄 {} 생략 가능
		B b5 = a -> System.out.println("메소드2-4" +a); // 입력매개변수가 하나일떄 () 생략가능
		b2.method2(1);
		b2.method2(2);
		b2.method2(3);
		b2.method2(4);
		
		
		
		// 3. 입력 x  리턴0
		
		//3-1 익명이너클래스
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println(c1.method3());
		
		C c2 = () -> {return 5;};
		C c3 = () -> 6;			//리턴이 한라인으로 적용된 경우 : return을 생략가능 , 반드시 중괄호와 함께생략
		
		
		
		System.out.println(c2.method3());
		System.out.println(c3.method3());
		
		
		// 4 . 입력 0 리턴 0 
		
		// 4-1 익명이너클래스
		
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a + b;
			}
		};
		System.out.println(d1.method4(1, 2));
		
		//4-2 람다식
		
		D d2 = (int a, int b) -> {return a+b;};
		D d3 = ( a,  b) -> {return a+b;};	// 매개변수 타입 생략가능
		D d4 = ( a,  b) ->  a+b;			// return 생략가능
		
		System.out.println(d2.method4(3, 4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
