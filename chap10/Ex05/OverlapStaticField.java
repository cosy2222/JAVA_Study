package chap10.Ex05;

class Aaa {             // static �ʵ�� �������̵� �ȵ� 
	static int m = 3;
	

}

class Bbb extends Aaa {
	static int m = 4;
	
}




public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. ��ü ���� ���� ȣ�� ( Ŭ���� ������ ȣ�� )  <===  static ������� 
		System.out.println(Aaa.m);
		System.out.println(Bbb.m);
		System.out.println("====================");
		
		
		// 2. ��ü ������ ȣ��
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		System.out.println(a.m);
		System.out.println(b.m);
		System.out.println("===========================");
		
		Aaa ab = new Bbb();
		System.out.println(ab.m);
		
		

	}

}
