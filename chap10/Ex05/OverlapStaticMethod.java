package chap10.Ex05;

class Aaaa{               // Static �޼ҵ� : �������̵� ���� �ʴ´�.
	static void print () {
		System.out.println("Aaaa Ŭ����");
	}
}

class Bbbb extends Aaaa{
	static void print() {
		System.out.println("Bbbb Ŭ����");
	}
}


public class OverlapStaticMethod {

	public static void main(String[] args) {
		Aaaa.print();
		Bbbb.print();
		
		Aaaa a = new Bbbb();
		a.print();
		

	}

}
