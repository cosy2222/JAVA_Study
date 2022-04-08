package chap17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Map : Key�� �ߺ����� �ʾƾ� ��  .equals() , hashCode() ������ ���Ѿ� �Ѵ� .
//		Value�� �ߺ��Ǿ ��. 

// equals() , hashCode()�� ������ ���� �ʴ� Ŭ���� 
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

//equals()�� ������
class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override		// ��ü�� �ʵ��� ���� ���ؼ� ������ ���� ���̴� 
	public boolean equals(Object obj) { // obj �� ObjectŸ������ ��ĳ����
		if (obj instanceof B) {			// obj�� bŸ���� �����ҋ� true
			if(this.data == ((B)obj).data) {
				return true;
			}
		}
		return false;
	}
}


// equals() , hashCode()�� ������
class C{
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override		// ��ü�� �ʵ��� ���� ���ؼ� ������ ���� ���̴� 
	public boolean equals(Object obj) { // obj �� ObjectŸ������ ��ĳ����
		if (obj instanceof C) {			// obj�� bŸ���� �����ҋ� true
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
		
		//1. �� �޼ҵ� ��� �������̵� ���� �������
		Map<A, String> hashmap1 = new HashMap();
		
		A a1 =new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);  // Stack�ּҸ� ��
		System.out.println(a1.equals(a2));	// == �� ����
		
		hashmap1.put(a1, "ù����");
		hashmap1.put(a2, "�ι���");
		System.out.println(hashmap1.size());
		System.out.println(hashmap1);
		
		System.out.println("=====================================");
		//2. equals() ������
		Map<B, String> hashmap2 = new HashMap();
		
		B b1 =new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 ==b2);
		System.out.println(b1.equals(b2));
		
		hashmap2.put(b1, "ù����");
		hashmap2.put(b2, "�ι���");
		System.out.println(hashmap2.size());
		System.out.println(hashmap2);
		
		System.out.println("===================");
		//3. equals() , hashCode() ������
		Map<C , String> hashmap3 = new HashMap();
		
		C c1 = new C(3);
		C c2 =new C(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		hashmap3.put(c1, "ù����");
		hashmap3.put(c2, "�ι���");
		
		System.out.println(hashmap3.size());
		System.out.println(hashmap3);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
