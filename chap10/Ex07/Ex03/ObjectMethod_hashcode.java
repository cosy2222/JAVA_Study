package chap10.Ex07.Ex03;

import java.util.HashMap;
// HashMap : key = 값 으로 저장되는 자료구조.
	// key 는 중복될 수 없다
	// HashMap에 key에 객체를 저장 할 경우 , key에 저장되는 객체가 중복되지 않는 고유한 정보를 저장해줘야됨
	// Object 클래스의 hashcode() 를 사용해서 객체가

class A{
	String name;
	A(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.name == ((A)obj).name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class B{
	String name;
	B(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.name == ((B)obj).name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override   
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1 = new HashMap<>();   // <Integer  <== key   ,String<== value
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");    //1 : 데이터 1 ==> 데이터2
		hm1.put(3, "데이터3");
				
		System.out.println(hm1);
		
		System.out.println("====================");
		
		
		HashMap<A, String> hm2 = new HashMap<>();   // equals() 만 재정의 되어있다  hashcode()는 재정의 안되있음
		hm2.put(new A("첫번쨰"), "데이터1");	
		hm2.put(new A("첫번쨰"), "데이터2");
		hm2.put(new A("두번쨰"), "데이터3");
		
		System.out.println(hm2);		// HashMap이 잘못 구현된 경우
		System.out.println("======================");
		
		HashMap<B, String> hm3 = new HashMap<>(); // hashcode() + equals() 재정의 ==> 동일개체 
		hm3.put(new B("첫번쨰"), "데이터1");
		hm3.put(new B("첫번쨰"), "데이터2");
		hm3.put(new B("두번쨰"), "데이터3");
		
		System.out.println(hm3);   // HashMap 구현이 제대로 설정된 경우 : key가 중복 되면 안된다.
						// hm3는 toString() 메소드가 재정의
		
		System.out.println("첫번쨰".hashCode());
		System.out.println("첫번쨰".hashCode());
		System.out.println("두번째".hashCode());
		
		
	}

}
