package chap12.Ex01;

class AA{				// 일반클래스 : 객체 생성시 필드와 메소드는 Heap 메모리 영역에 저장
	int a;
	double b;
	char c; 
	boolean d; 
	byte e;
	float f;
	String g;
	
	void crt() {}

	@Override
	public String toString() {
		return a+ " , " + b+ " , " + c+ " , " + d+ " , " + e+ " , " + f+ " , " +g;
	}
	
	
}

//1. 추상클래스를 객체화 해서 출력하는 방법 1 
		// 상속을 통해서 자식클래스를 생성하고, 자식클래스에서 추상 메소드를 재정의 하고 , 자식클래스를 객체로 생성후 출력
		// 많은 객체를 생성해서 사용할떄 쓰는 방법

// 2. 추상클래스를 객체화 해서 출력하는 방법 2
		//자식 클래스 생성 없이 , main 메소드에서 익명 객체를 생성해서 출력하는 방법
		// 임시로 한번만 사용할떄는 자식 객체를 생성할 필요 없이 임시로 사용 할 경우
		// 이벤트 처리할떄 (임시)

abstract class A{
	
	abstract void abc();
}

class B extends A{    // 추상 메소드를 구현한 객체 : 자주 사용할 경우

	@Override
	void abc() {
		System.out.println("방법1 : 자식 클래스 생성 추상 메소드 구현");
	}
	
}



public class AbstractClass_1 {

	public static void main(String[] args) {
		
		// 1 . AA클래스는 객체화 가능
		AA aa = new AA();			// 필드 : 초기화 , 일반메소드 (구현부가 존재하는 메소드)
		System.out.println(aa);		// 객체를 생성 할러면 Heap공간에 값이 반드시 들어가 있어야 한다
		
		
		//2. 추상메소드는 객체생성 불가    :  메소드가 미완성 메소드 이기 떄문에 객체생성 불가
	//	A a = new A();    //객체 생성 불가 
		
		
		//3. 추상 클래스가 구현된 자식 클래스 객체 생성
		A a1 = new B();       
		A a2 = new B();
		A a3 = new B();
		
		// 4. 메소드 호출
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
