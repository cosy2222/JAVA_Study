package chap13.Ex05;


//�����̳�Ŭ������ ������ ���� ���� Ŭ���� ����


class A{
	void abc() {
		class B{}      // A$1B.class
		class C{}      // A$1C.class
	}
	
	void bcd(){
		class C{}      //  A$2C.class
		class D{}		// A$1D.class	
	}
	
	void cde() {
		class B{}      //  A$2B.class
		class C{}		// A$3C.class
	}
}


public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
