package chap17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Map : Key는 중복되지 않아야 함  .equals() , hashCode() 재정의 시켜야 한다 .
//		Value는 중복되어도 됨. 

// equals() , hashCode()를 재정의 하지 않는 클래스 
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data + ""  ;
	}
}

//equals()만 재정의
class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override		// 객체의 필드의 값을 비교해서 같으면 같은 값이다 
	public boolean equals(Object obj) { // obj 는 Object타입으로 업캐스팅
		if (obj instanceof B) {			// obj가 b타입을 포함할떄 true
			if(this.data == ((B)obj).data) {
				return true;
			}
		}
		return false;
	}
}


// equals() , hashCode()를 재정의
class C{
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override		// 객체의 필드의 값을 비교해서 같으면 같은 값이다 
	public boolean equals(Object obj) { // obj 는 Object타입으로 업캐스팅
		if (obj instanceof C) {			// obj가 b타입을 포함할떄 true
			if(this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
}


public class HashMapMachanism {

	public static void main(String[] args) {
		
		//1. 두 메소드 모두 오버라이딩 하지 않은경우
		Map<A, String> hashmap1 = new HashMap();
		
		A a1 =new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);  // Stack주소를 비교
		System.out.println(a1.equals(a2));	// == 과 같다
		
		hashmap1.put(a1, "첫번쨰");
		hashmap1.put(a2, "두번쨰");
		System.out.println(hashmap1.size());
		System.out.println(hashmap1);
		
		System.out.println("=====================================");
		//2. equals() 재정의
		Map<B, String> hashmap2 = new HashMap();
		
		B b1 =new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 ==b2);
		System.out.println(b1.equals(b2));
		
		hashmap2.put(b1, "첫번쨰");
		hashmap2.put(b2, "두번쨰");
		System.out.println(hashmap2.size());
		System.out.println(hashmap2);
		
		System.out.println("===================");
		//3. equals() , hashCode() 재정의
		Map<C , String> hashmap3 = new HashMap();
		
		C c1 = new C(3);
		C c2 =new C(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		hashmap3.put(c1, "첫번쨰");
		hashmap3.put(c2, "두번쨰");
		
		System.out.println(hashmap3.size());
		System.out.println(hashmap3);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
