package chap10.Ex05;

class A{
	
	// �ν��Ͻ� �޼ҵ� : ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵� �� 
		// ��Ӱ��迡�� �ν��Ͻ� �ʵ� , stack �ʵ� , static �޼ҵ�� �������̵� ���� �ʽ��ϴ�
		// �������̵� �ҋ��� �ñ״��İ� ���ƾ��Ѵ� .  ����Ÿ�� , �޼ҵ�� , �Ű����� Ÿ�� , �Ű����� ���� 
	void print() {
		System.out.println("class A ���");
	}
}

class B extends A {

	@Override
	void print() {
		System.out.println("class B ���");
	}
}

class C extends A {
	@Override
	void print() {
		System.out.println("class C ���");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		// 1 .  AŸ�� , A������
		A a = new A();
		a.print();
		
		// 2 . BŸ�� , B������
		B b = new B();
		b.print();
		
		// 3. C Ÿ�� , C������
		C c = new C();
		c.print();
		System.out.println("===================================");
		//4. AŸ�� B������ ( �������̵� �Ǿ� A�� print() ȣ��� , B�� print() �� �۵�
		A ab = new B();
		ab.print();
		
		//5.  AŸ�� C������
		A ac = new C();
		ac.print();
		
		System.out.println("=================================");
		
		A[] arr = {ab,ac};   // �迭�� AŸ���� ��ü�� ����
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i].print();
		}
		System.out.println("==============================");
		for( A k : arr) {
			k.print();
		}
		
		
		

	}

}


















