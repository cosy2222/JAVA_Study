package chap10.Ex05;

class A{
	
	// 인스턴스 메소드 : 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩 됨 
		// 상속관계에서 인스턴스 필드 , stack 필드 , static 메소드는 오버라이딩 되지 않습니다
		// 오버라이딩 할떄는 시그니쳐가 같아야한다 .  리턴타입 , 메소드명 , 매개변수 타입 , 매개변수 갯수 
	void print() {
		System.out.println("class A 출력");
	}
}

class B extends A {

	@Override
	void print() {
		System.out.println("class B 출력");
	}
}

class C extends A {
	@Override
	void print() {
		System.out.println("class C 출력");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		// 1 .  A타입 , A생성자
		A a = new A();
		a.print();
		
		// 2 . B타입 , B생성자
		B b = new B();
		b.print();
		
		// 3. C 타입 , C생성자
		C c = new C();
		c.print();
		System.out.println("===================================");
		//4. A타입 B생성자 ( 오버라이딩 되어 A의 print() 호출시 , B의 print() 가 작동
		A ab = new B();
		ab.print();
		
		//5.  A타입 C생성자
		A ac = new C();
		ac.print();
		
		System.out.println("=================================");
		
		A[] arr = {ab,ac};   // 배열에 A타입의 객체를 저장
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i].print();
		}
		System.out.println("==============================");
		for( A k : arr) {
			k.print();
		}
		
		
		

	}

}


















