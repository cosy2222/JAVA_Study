package chap18.Ex06;

interface A{
	void abc(B b , int k);
}

class B{
	void bcd(int k) {
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type_3 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조 Type2
		
		// 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식 
		A a2 = (B b , int k) -> {
			b.bcd(k);
		};
		
		// 인스턴스 메소드 참조
		A a3 = B::bcd;
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
		
		
		
		
		
		
		
		

	}

}
