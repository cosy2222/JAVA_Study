package chap18.Ex10;


interface A{
	B abc(int k);   // ����Ÿ���� B��ü�� ���� 
}

class B{
	B(){
		System.out.println("ù���� ������");
	}
	B(int k ){
		System.out.println("�ι��� ������");
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		
		// �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};
		
		
		// ���ٽ� ǥ��
		A a2 = (int k) -> {return new B(3);};
		A a3 = k -> new B(3);
		
		// Ŭ���� ������ ����
		A a4 = B::new;
		
		
		a1.abc(3);
		a2.abc(0);
		a3.abc(0);
		a4.abc(0);
		
		

	}

}
