package chap10.Ex06;

// super : �θ� Ŭ����
// this  : �ڽ��� ��ü



class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd () {
		abc();      // this.abc
		super.abc();       
	}
}

public class Superkeyword_1 {

	public static void main(String[] args) {
		// 1 . ��ü ���� 
		B bb = new B();
		
		// 2 . �޼ҵ� ȣ��
		bb.bcd();    //BŬ������ bcd ȣ��
	}

}
