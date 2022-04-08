package chap10.Ex02;

// 다형성 ( Polymorphism ) : 객체의 상속관계에서 여러 데이터 타입으로 변환 

class A {
	
}

class B extends A {
	
}

class C extends B{
	
}

class D extends B{
	
}


public class Polymorphism {

	public static void main(String[] args) {
		
		// 1. 업캐스팅 ( 자동으로 변환 ) : 생략시 컴파일러가 자동으로 추가 
		A ac = new C(); // C ==> A :    C는 A이다. ac는 A ,B , C의 필드와 메소드를 모두포함 , A의 필드와 메소드만 접근가능
		A ab = new B(); // B ==> A :    B는 A이다. ab는 A ,B 의 필드와 메소드를 모두포함 , A의 필드와 메소드만 접근가능
		B bb = new D(); // D ==> B :    D는 B다 .  bb는 A,B,D 의 필드와 메소드를 모두포함 A,B의 필드와 메소드만 접근가능
		C c = new C();  // C ==> C :    C는 C다 . c 는 A,B,C의 필드와 메소드를 모두포함 A,B,C의 필드와 메소드 접근가능
		
		
		// 객체 생성을 할 수 없는 경우 (상속)
	//	B b = new A();
	//  C cc1 = new B();
	//	D dd1 = new B();
	//	C cd = new D();
		
		// 3. 다운 캐스팅 : 부모 ==> 자식 (수동 변환 ) : 캐스팅이 불가능 하면 (실행시 오류 발생 : 런타임 오류)
			// 다운 캐스팅이 불가능한 경우 : 다운 캐스팅할 데이터 타입이 포함되어있지 않은 겨우 
		A aa = new A();  // aa는 A타입만 포함하고 있다
//		B b1 = (B) aa;   // A ==> B 다운 캐스팅  <== 실행시 오류
			// java.lang.ClassCastException : 다운 캐스팅시 객체 내의 해당 타입이 존재하지 않는 경우
		
//		C cc = (C) aa;   // aa는 C타입을 포함하지 않는데 다운 캐스팅을 할 경우 실행시 오류
		
		// 컴파일 오류 : 프로그램을 실행전 , 이클립스가 체크
		// 런타임 오류 : 프로그램을 실행시 발생되는 오류
		
		// 4. 다운 캐스팅이 가능한 경우 (수동변환) : 객체 내부에 자식 데이터 타입을 가지고 있으면 캐스팅 가능 
		A ac3 = new C();  // ac3 는 A,B,C 포함  A사용가능    
		B ac4 = (B) ac3;  //  ac3 ==> B타입으로 다운캐스팅  A,B 사용가능
		C ac6 = (C) ac3;  //  ac3 ==> C타입으로 다운캐스팅 A,B,C 사용가능
		
		A ad2 = new D();  //  ad2 는  A,B,D 포함 
		B ad3 = (B) ad2;
		D ad4 = (D) ad2;
		
		
		
		
		
		
		
		
		
		

	}

}
