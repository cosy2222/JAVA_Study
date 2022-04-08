package chap12.Ex02;

// 인터 페이스 ( interface) : 외부와 내부를 연결 시켜주는 접점
		// 객체 생성 불가 ,  타입은 설정 가능 
		// 모든 필드는 반드시 : public static final 생략 
		// 모든 메소드는 : public abstract 생략 (자바 1.8버전 까지)


interface A{		// 정식 포현 
	public static final int a = 3;     // Interface 필드의 정식 표현
	public abstract void abc() ;		// Interface 메소드의 정식 표현
}

interface B{       // 생략된 구현 
	int a = 3;
	void abc();		// interface 에서는 abstract 생략 가능
}

abstract class C {        // 추상클래스 일떄는 abstract 생략 불가 
	abstract void abc();                   
}





public class Interface_1 {

	public static void main(String[] args) {
		
		// interface는 객체 생성 불가. 구현되지 않는 메소드가 포함되어 있음
//		A a = new A();   // A가 interface 이므로 객체생성 불가
		
		// interface의 필드 출력 
		System.out.println(A.a);
		System.out.println(B.a);
		
		
		// final이 적용되어 있기 떄문에 값을 수정 할 수 없다 
//		A.a=5;      
//		B.a=6;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
