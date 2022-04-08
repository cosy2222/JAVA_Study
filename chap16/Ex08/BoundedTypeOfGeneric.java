package chap16.Ex08;

class A {}
class B extends A {}
class C extends B {}


// ���ʸ� Ÿ���� Ŭ���� : ���ʸ� Ÿ���� ������ ��ü�� ������ �� 
class D <T extends B> {  // T extends B : class B , class C �� �ü� �ִ�
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}



public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
		
//		D<A> d1 = new D<A>();   // �Ұ��� : <T> �� �� ��ü�� ������ ��  
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D();		// = D(B) , D(C)   // Ÿ���� �������� �ʰ� ��ü ������ �ֻ��� Ÿ������ ������
							
		d2.setT(new B());   //B��ü ����
		d2.setT(new C());	//C ��ü ����
//		d2.setT(new A());	// A�� �Ұ���
		
		// d3�� CŸ�Ը� �ü� �ִ�
//		d3.setT(new B());
		d3.setT(new C());
//		d3.setT(new A());
		
//		d4.setT(new A());
		d4.setT(new B());
		d4.setT(new C());

	}

}
