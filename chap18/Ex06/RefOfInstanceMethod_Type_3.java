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
		// �ν��Ͻ� �޼ҵ� ���� Type2
		
		// �͸� �̳� Ŭ����
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// ���ٽ� 
		A a2 = (B b , int k) -> {
			b.bcd(k);
		};
		
		// �ν��Ͻ� �޼ҵ� ����
		A a3 = B::bcd;
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
		
		
		
		
		
		
		
		

	}

}
