package chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : 중복된 값을 넣을수 없다
		// equals() 메소드 , hashcode() 메소드가 정의 되어 있어야 한다
		// String , Integer 클래스들은 equals() 메소드와 hashcode() 가 재정의 되어 있다
		// 특정 객체를 set에 저장할 경우 중복 저장을 하지 못하도록 하기 위해서는 equals()와 hashcode() 메소드를 재정의 해야 한다
		// Object클래스의 equals()와 hashcode()
			// Object 클래스의 equals () 메소드는 == 와 같다
				// ==는 Stack 메모리의 값을 비교

// equals() , hashcode() 메소드가 재정의 되지 않은 상태
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}


// equals()는 재정의 하고 , hashcode()는 재정의되지 않은 상태
class B{
	int data ;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// 객체의 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정.
		
		if (obj instanceof B) {
			this.data = ((B)obj).data;		// 주의: 잘못 다운캐스팅을 할경우 : 예외가 발생됨
			return true;
		}
		
		return false;
	}
}

//equals()는 재정의 하고 , hashcode()도 재정의
class C{
	int data ;
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// 객체의 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정.
		
		if (obj instanceof C) {
			this.data = ((C)obj).data;		// 주의: 잘못 다운캐스팅을 할경우 : 예외가 발생됨
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {			// Objects.hash	(필드명,필드명,필드명) 			<== 여러개의 필드의 해쉬코드를 같게 설정
		return Objects.hash(data);
	}
}


public class HashSetMachanism {

	public static void main(String[] args) {
		
		//1. equals() , hashcode() 메소드가 재정의 되지 않은 상태
		Set<A> hashset1 = new HashSet();
		A a1= new A(3);
		A a2 = new A(3);
		System.out.println(a1== a2);
				// == : 스택 메모리의 값을 비교
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));	// false     // object의 equals : ==
		System.out.println(a1.hashCode() + " " + a2.hashCode());	// 10진수로 표현
		
		System.out.println(hashset1.size());
		
		System.out.println("===========================");
		//2. equals()는 재정의 하고 , hashcode()는 재정의되지 않은 상태
		Set<B> hashset2 = new HashSet();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));	// true
		
		hashset2.add(b1);
		hashset2.add(b2);
		
		System.out.println(hashset2.size());
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		//equals()는 재정의 하고 , hashcode()도 재정의
		Set<C> hashset3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);
		
		System.out.println(c1.equals(c2));	
		System.out.println(c1.hashCode() + " " + c2.hashCode());	// data필드를 기준으로 hashcode생성 두객체는 동일한 객체다
		
		hashset3.add(c1);
		hashset3.add(c2);
		System.out.println(hashset3.size());
		
		
	}

}
