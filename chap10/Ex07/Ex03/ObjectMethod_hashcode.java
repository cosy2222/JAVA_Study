package chap10.Ex07.Ex03;

import java.util.HashMap;
// HashMap : key = �� ���� ����Ǵ� �ڷᱸ��.
	// key �� �ߺ��� �� ����
	// HashMap�� key�� ��ü�� ���� �� ��� , key�� ����Ǵ� ��ü�� �ߺ����� �ʴ� ������ ������ ��������ߵ�
	// Object Ŭ������ hashcode() �� ����ؼ� ��ü��

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
		hm1.put(1, "������1");
		hm1.put(1, "������2");    //1 : ������ 1 ==> ������2
		hm1.put(3, "������3");
				
		System.out.println(hm1);
		
		System.out.println("====================");
		
		
		HashMap<A, String> hm2 = new HashMap<>();   // equals() �� ������ �Ǿ��ִ�  hashcode()�� ������ �ȵ�����
		hm2.put(new A("ù����"), "������1");	
		hm2.put(new A("ù����"), "������2");
		hm2.put(new A("�ι���"), "������3");
		
		System.out.println(hm2);		// HashMap�� �߸� ������ ���
		System.out.println("======================");
		
		HashMap<B, String> hm3 = new HashMap<>(); // hashcode() + equals() ������ ==> ���ϰ�ü 
		hm3.put(new B("ù����"), "������1");
		hm3.put(new B("ù����"), "������2");
		hm3.put(new B("�ι���"), "������3");
		
		System.out.println(hm3);   // HashMap ������ ����� ������ ��� : key�� �ߺ� �Ǹ� �ȵȴ�.
						// hm3�� toString() �޼ҵ尡 ������
		
		System.out.println("ù����".hashCode());
		System.out.println("ù����".hashCode());
		System.out.println("�ι�°".hashCode());
		
		
	}

}
