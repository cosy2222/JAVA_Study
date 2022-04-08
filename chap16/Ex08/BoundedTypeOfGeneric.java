package chap16.Ex08;

class A {}
class B extends A {}
class C extends B {}


// 제너릭 타입의 클래스 : 제너릭 타입의 들어오는 객체를 제한을 둠 
class D <T extends B> {  // T extends B : class B , class C 만 올수 있다
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
		
//		D<A> d1 = new D<A>();   // 불가능 : <T> 의 들어갈 객체를 제한을 둠  
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D();		// = D(B) , D(C)   // 타입을 지정하지 않고 객체 생성시 최상위 타입으로 설정됨
							
		d2.setT(new B());   //B객체 저장
		d2.setT(new C());	//C 객체 저장
//		d2.setT(new A());	// A는 불가능
		
		// d3는 C타입만 올수 있다
//		d3.setT(new B());
		d3.setT(new C());
//		d3.setT(new A());
		
//		d4.setT(new A());
		d4.setT(new B());
		d4.setT(new C());

	}

}
