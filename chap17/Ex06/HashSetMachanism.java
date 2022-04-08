package chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : �ߺ��� ���� ������ ����
		// equals() �޼ҵ� , hashcode() �޼ҵ尡 ���� �Ǿ� �־�� �Ѵ�
		// String , Integer Ŭ�������� equals() �޼ҵ�� hashcode() �� ������ �Ǿ� �ִ�
		// Ư�� ��ü�� set�� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ� ���ؼ��� equals()�� hashcode() �޼ҵ带 ������ �ؾ� �Ѵ�
		// ObjectŬ������ equals()�� hashcode()
			// Object Ŭ������ equals () �޼ҵ�� == �� ����
				// ==�� Stack �޸��� ���� ��

// equals() , hashcode() �޼ҵ尡 ������ ���� ���� ����
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}


// equals()�� ������ �ϰ� , hashcode()�� �����ǵ��� ���� ����
class B{
	int data ;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// ��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����.
		
		if (obj instanceof B) {
			this.data = ((B)obj).data;		// ����: �߸� �ٿ�ĳ������ �Ұ�� : ���ܰ� �߻���
			return true;
		}
		
		return false;
	}
}

//equals()�� ������ �ϰ� , hashcode()�� ������
class C{
	int data ;
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		// ��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����.
		
		if (obj instanceof C) {
			this.data = ((C)obj).data;		// ����: �߸� �ٿ�ĳ������ �Ұ�� : ���ܰ� �߻���
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {			// Objects.hash	(�ʵ��,�ʵ��,�ʵ��) 			<== �������� �ʵ��� �ؽ��ڵ带 ���� ����
		return Objects.hash(data);
	}
}


public class HashSetMachanism {

	public static void main(String[] args) {
		
		//1. equals() , hashcode() �޼ҵ尡 ������ ���� ���� ����
		Set<A> hashset1 = new HashSet();
		A a1= new A(3);
		A a2 = new A(3);
		System.out.println(a1== a2);
				// == : ���� �޸��� ���� ��
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));	// false     // object�� equals : ==
		System.out.println(a1.hashCode() + " " + a2.hashCode());	// 10������ ǥ��
		
		System.out.println(hashset1.size());
		
		System.out.println("===========================");
		//2. equals()�� ������ �ϰ� , hashcode()�� �����ǵ��� ���� ����
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
		
		//equals()�� ������ �ϰ� , hashcode()�� ������
		Set<C> hashset3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);
		
		System.out.println(c1.equals(c2));	
		System.out.println(c1.hashCode() + " " + c2.hashCode());	// data�ʵ带 �������� hashcode���� �ΰ�ü�� ������ ��ü��
		
		hashset3.add(c1);
		hashset3.add(c2);
		System.out.println(hashset3.size());
		
		
	}

}
